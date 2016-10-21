package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.JpushPersonVo;
import com.yz.po.Jpushperson;
import com.yz.service.JpushpersonService;
import com.yz.utils.DateTimeKit;

@Controller
public class JPushPersonController {

	@Autowired
	private JpushpersonService jpushpersonService;

	@RequestMapping("/jlist")
	public ModelAndView findJPushPersonList(HttpServletRequest request, Jpushperson jpushperson) throws Exception {

		List<Jpushperson> jpushpersonList = jpushpersonService.findJPushPersonList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jpushpersonList", jpushpersonList);
		modelAndView.setViewName("jpushpersons_histroy");
		return modelAndView;

	}

	@RequestMapping("/jcheck")
	public ModelAndView check(HttpServletRequest request, Jpushperson jpushperson) throws Exception {

		List<Jpushperson> jpushpersonList = jpushpersonService.jpushpersonCheck();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jpushpersonList", jpushpersonList);
		modelAndView.setViewName("jpushpersons");

		return modelAndView;
	}

	@RequestMapping("/correct")
	public String correct(HttpServletRequest request, Integer id) throws Exception {
		Jpushperson jpushperson = jpushpersonService.findJPushPersonById(id);
		jpushperson.setIstrue(1);
		jpushpersonService.updateJPushPerson(id, jpushperson);
		return "redirect:jcheck";
	}

	@RequestMapping("/incorrect")
	public String incorrect(HttpServletRequest request, Integer id) throws Exception {
		Jpushperson jpushperson = jpushpersonService.findJPushPersonById(id);
		jpushperson.setIstrue(2);
		jpushpersonService.updateJPushPerson(id, jpushperson);
		return "redirect:jcheck";
	}

	@RequestMapping("/jdelete")
	public String delete(HttpServletRequest request, Integer id) throws Exception {
		jpushpersonService.deleteJPushPersonById(id);
		return "redirect:jlist";
	}

	@RequestMapping("/clientList/{begin}/{limit}/{userroleid}")
	public @ResponseBody List<Jpushperson> clientList(@PathVariable("begin") Integer begin,
			@PathVariable("limit") Integer limit, @PathVariable("userroleid") Integer userroleid) throws Exception {
		JpushPersonVo jpushPersonVo = new JpushPersonVo();
		jpushPersonVo.setBegin(begin);
		jpushPersonVo.setLimit(limit);
		jpushPersonVo.setUserroleid(userroleid);

		return jpushpersonService.findJpushPersonByUserOnApp(jpushPersonVo);
	}

	@RequestMapping("/checkCount/{userroleid}")
	public @ResponseBody Integer count(@PathVariable("userroleid") Integer userroleid) throws Exception {
		return jpushpersonService.count(userroleid);
	}

	@RequestMapping("/insertJpushpersons/{number}")
	public @ResponseBody Integer insertJpushpersons(@PathVariable("number") Integer number) throws Exception {

		int insertResult = 0;
		String name = "姓名";
		String idcard = "身份证号";

		for (int i = 0; i < number; i++) {

			Jpushperson person = new Jpushperson();
			person.setRealname(name + "_" + i);
			person.setIdcard(idcard + "_" + i);
			person.setIstrue(1);
			person.setUserroleId(3);
			person.setCheckstarttime(DateTimeKit.getLocal_Time());
			person.setBackcheckresulttime(DateTimeKit.getLocal_Time());
			try {
				jpushpersonService.insert(person);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		insertResult = 1;
		return insertResult;
	}
	
	@RequestMapping("/deleteJpushpersons")
	public @ResponseBody Integer deleteJpushpersons() throws Exception {

		int deleteResult = 0;
		
		jpushpersonService.deleteAllJpushpersons();
		deleteResult = 1;
		return deleteResult;
	}

}
