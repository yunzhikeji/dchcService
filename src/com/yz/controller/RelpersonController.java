package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Relperson;
import com.yz.service.RelpersonService;

@Controller
@RequestMapping("/relperson")
public class RelpersonController {
	@Autowired
	private RelpersonService relpersonService;

	@RequestMapping("/addRelperson")
	public @ResponseBody Relperson addRelperson(Relperson relperson)
			throws Exception {
		relpersonService.insert(relperson);
		Relperson ps = new Relperson();
		ps.setId(-1);
		return ps;
	}

	@RequestMapping("/toAdd")
	public String toAdd() throws Exception {
		return "relperson/relpersonAdd";
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


}
