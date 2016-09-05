package com.yz.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yz.po.Person;
import com.yz.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/addPerson")
	public @ResponseBody Person addPerson(Person person,MultipartFile facepic,MultipartFile bodyphoto) throws Exception {
		// 存储图片的物理路径
		String pic_path = "C:\\develop\\upload\\temp\\";
		if (facepic != null){
			String originalFacepicFilename = facepic.getOriginalFilename();
			// 上传图片
			if (originalFacepicFilename != null && originalFacepicFilename.length() > 0){
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
		if (bodyphoto != null){
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
	

}
