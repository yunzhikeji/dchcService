package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Locate;
import com.yz.service.LocateService;

@Controller
@RequestMapping("/locate")
public class LocateController {
	
	@Autowired
	private LocateService locateService;

	@RequestMapping("/addLocate")
	public @ResponseBody Locate addLocate(Locate locate)
			throws Exception {
		locateService.insert(locate);
		Locate ps = new Locate();
		ps.setId(-1);
		return ps;
	}


	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) throws Exception {
		List<Locate> locateList = locateService.findLocateList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("locateList", locateList);
		modelAndView.setViewName("locates");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		locateService.deleteLocateById(id);
		return "redirect:/locate/list";
	}
	
	
	@RequestMapping("/update")
	public String update(Integer id,Locate locate) throws Exception {
		locateService.updateLocateById(id,locate);
		return "redirect:/locate/list";
	}


}
