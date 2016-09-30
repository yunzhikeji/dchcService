package com.yz.controller;

import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Relperson;
import com.yz.service.RelpersonService;
import com.yz.vo.UploadResult;

@Controller
@RequestMapping("/relperson")
public class RelpersonController {
	@Autowired
	private RelpersonService relpersonService;

	@RequestMapping("/addRelperson")
	public @ResponseBody UploadResult addRelperson(Relperson relperson)
			throws Exception {
		relpersonService.insert(relperson);
		UploadResult uploadResult = new UploadResult();
		uploadResult.setUploadResult(1);
		return uploadResult;
	}

	@RequestMapping("/toEdit")
	public String toEdit(HttpServletRequest request, Model model, Integer id) throws Exception {
		Relperson relperson = relpersonService.findRelpersonById(id);
		model.addAttribute("relperson", relperson);
		return "relperson/relpersonUpdate";
	}


	@RequestMapping("/query")
	public ModelAndView Query(HttpServletRequest request,Relperson relperson) throws Exception {
		List<Relperson> relpersonList = relpersonService.findRelpersonListByRelpersonQuery(relperson);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("relpersonList", relpersonList);
		modelAndView.setViewName("relperson/relpersonList");
		return modelAndView;
		
	}
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) throws Exception {
		List<Relperson> relpersonList = relpersonService.findRelpersonList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("relpersonList", relpersonList);
		modelAndView.setViewName("relperson/relpersonList");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		relpersonService.deleteRelpersonById(id);
		return "redirect:/relperson/list";
	}
	
	
	
	@RequestMapping("/update")
	public String update(Integer id,Relperson relperson) throws Exception {
		relpersonService.updateRelpersonById(id,relperson);
		return "redirect:/relperson/list";
	}


	@RequestMapping("/editRelpersonSubmit")
	public  String editRelpersonSubmit(Model model, HttpServletRequest request, Integer id,Relperson relperson) throws Exception {
		relpersonService.updateRelpersonById(id, relperson);
		return "redirect:/relperson/list";
	}
}
