package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Clientversion;
import com.yz.po.Jpushperson;
import com.yz.po.Person;
import com.yz.service.ClientversionService;
import com.yz.service.LocateService;
import com.yz.service.PersonService;

@Controller
public class CountController {
	
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private LocateService locateService;
	
	
	@RequestMapping("/count")
	public ModelAndView list() throws Exception {
		List<Person> personList = personService.findPersonList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("personList", personList);
		modelAndView.setViewName("personlist");
		return modelAndView;
	}

}
