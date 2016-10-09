package com.yz.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Jpushperson;
import com.yz.po.Person;
import com.yz.po.Userrole;
import com.yz.service.PersonService;
import com.yz.utils.ExcelFileGenerator;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping("/addPerson")
	public @ResponseBody Person addPerson(Person person, MultipartFile facepic, MultipartFile bodyphoto)
			throws Exception {
		// 存储图片的物理路径
		String pic_path = "/home/develop/upload/temp/";
		if (facepic != null) {
			String originalFacepicFilename = facepic.getOriginalFilename();
			// 上传图片
			if (originalFacepicFilename != null && originalFacepicFilename.length() > 0) {
				// 存储图片的物理路径

				// 新的图片名称
				String newFacepicFilename = UUID.randomUUID()
						+ originalFacepicFilename.substring(originalFacepicFilename.lastIndexOf("."));
				// 新图片
				File newFacepicFile = new File(pic_path + newFacepicFilename);

				// 将内存中的数据写入磁盘
				facepic.transferTo(newFacepicFile);
				// 将新图片名称写到person中
				person.setAvanta(newFacepicFilename);
			}
		}
		if (bodyphoto != null) {
			String originalBodyphotoFilename = bodyphoto.getOriginalFilename();
			if (originalBodyphotoFilename != null && originalBodyphotoFilename.length() > 0) {
				// 新的图片名称
				String newBodyphotoFilename = UUID.randomUUID()
						+ originalBodyphotoFilename.substring(originalBodyphotoFilename.lastIndexOf("."));
				// 新图片
				File newBodyphotoFile = new File(pic_path + newBodyphotoFilename);

				// 将内存中的数据写入磁盘
				bodyphoto.transferTo(newBodyphotoFile);

				// 将新图片名称写到person中
				person.setBodypic(newBodyphotoFilename);
			}

		}
		personService.insert(person);
		Person ps = new Person();
		ps.setId(-1);

		return ps;
	}

	@RequestMapping("/export")
	public String export(HttpServletResponse response) throws Exception {
		// 获取导出的表头和数据
		// 获取表头,存放到ArrayList对象中(人员编号 姓名 出生日期 QQ 微信号 身份证号 户籍地址 户籍区域)
		ArrayList fieldName = personService.getExcelFieldNameList();
		// 获取数据
		ArrayList fieldData = personService.getExcelFieldDataList();
		OutputStream out = response.getOutputStream();

		response.reset();

		String excelName = "person.xls";
		response.setHeader("Content-Disposition", "attachment; filename=" + excelName);
		// 设置excel报表的形式
		response.setContentType("application/vnd.ms-excel");
		ExcelFileGenerator generator = new ExcelFileGenerator(fieldName, fieldData);
		generator.expordExcel(out);
		// 设置输出形式
		System.setOut(new PrintStream(out));
		// 刷新输出流
		out.flush();
		// 关闭输出流
		if (out != null) {
			out.close();

		}
		return null;

	}

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request, Jpushperson jpushperson) throws Exception {
		List<Person> personList = personService.findPersonList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("personList", personList);
		modelAndView.setViewName("personlist");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		personService.deletePersonById(id);
		return "redirect:/person/list";
	}

	@RequestMapping("/clean")
	public String truncate() throws Exception {
		personService.truncate();
		return "redirect:/person/list";
	}


}
