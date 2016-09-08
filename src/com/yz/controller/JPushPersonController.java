package com.yz.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Jpushperson;
import com.yz.service.JpushpersonService;
import com.yz.utils.ExcelFileGenerator;

@Controller

public class JPushPersonController {

	@Autowired
	private JpushpersonService jpushpersonService;

	// @RequestMapping("/jlist")
	// public List<Jpushperson> findJPushPersonList() throws Exception {
	// System.out.println("listooo");
	// List<Jpushperson> jpushpersonList =
	// jpushpersonService.findJPushPersonList();
	// return jpushpersonList;
	// }
	//
	// @RequestMapping("/jcheck")
	// public Jpushperson check() throws Exception {
	//
	// return null;
	// }
	@RequestMapping("/jlist")
	public ModelAndView findJPushPersonList(HttpServletRequest request, Jpushperson jpushperson) throws Exception {
		
		
		List<Jpushperson> jpushpersonList = jpushpersonService.findJPushPersonList();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("jpushpersonList", jpushpersonList);
		modelAndView.setViewName("jpushpersons");
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
	public String correct(HttpServletRequest request,Integer id) throws Exception {
		Jpushperson jpushperson = jpushpersonService.findJPushPersonById(id);
		jpushperson.setIstrue(1);
		jpushpersonService.updateJPushPerson(id, jpushperson);
		return "redirect:jcheck";
	}
	
	@RequestMapping("/incorrect")
	public String incorrect(HttpServletRequest request,Integer id) throws Exception {
		Jpushperson jpushperson = jpushpersonService.findJPushPersonById(id);
		jpushperson.setIstrue(0);
		jpushpersonService.updateJPushPerson(id, jpushperson);
		return "redirect:jcheck";
	}
	
	@RequestMapping("/jdelete")
	public String delete(HttpServletRequest request,Integer id) throws Exception {
		jpushpersonService.deleteJPushPersonById(id);
		return "redirect:jlist";
	}
	


}
