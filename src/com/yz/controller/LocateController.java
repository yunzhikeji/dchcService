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
import com.yz.utils.DateTimeKit;

@Controller
@RequestMapping("/locate")
public class LocateController {
	
	@Autowired
	private LocateService locateService;

	@RequestMapping("/addLocate")
	public @ResponseBody Locate addLocate(Locate locate)
			throws Exception {
		locate.setUploadtime(DateTimeKit.getLocal_Time());//设置上传时间
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
		modelAndView.setViewName("locate/locates");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		locateService.deleteLocateById(id);
		return "redirect:/locate/list";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() throws Exception {
		
		return "locate/locateAdd";
		
	}
	
	@RequestMapping("/add")
	public String add(Locate locate) throws Exception {
		
		locate.setUploadtime(DateTimeKit.getLocal_Time());//设置上传时间
		locateService.insert(locate);
		return "op_success_child";
	}
	
	
	@RequestMapping("/update")
	public String update(Integer id,Locate locate) throws Exception {
		locateService.updateLocateById(id,locate);
		return "redirect:/locate/list";
	}


}
