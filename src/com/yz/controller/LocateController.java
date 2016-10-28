package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.po.Relperson;
import com.yz.service.LocateService;
import com.yz.service.RelpersonService;
import com.yz.utils.DateTimeKit;
import com.yz.vo.UploadResult;

@Controller
@RequestMapping("/locate")
public class LocateController {
	
	@Autowired
	private LocateService locateService;
	
	@Autowired
	private RelpersonService relpersonService;

	@RequestMapping("/addLocate")
	public @ResponseBody UploadResult addLocate(Locate locate)
			throws Exception {
		locate.setUploadtime(DateTimeKit.getLocal_Time());//设置上传时间
		locateService.insert(locate);
		
		UploadResult uploadResult = new UploadResult();
		uploadResult.setUploadResult(1);
		return uploadResult;
	}


	@RequestMapping("/list")
	public ModelAndView list(LocateQuery locateQuery) throws Exception {
		
		List<Locate> locateList = locateService.findLocateListByQueryMessage(locateQuery);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("locateList", locateList);
		modelAndView.setViewName("locate/locateList");
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
	
	@RequestMapping("/load")
	public ModelAndView load(Integer id) throws Exception {
		Locate locate = locateService.findLocateById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("locate", locate);
		modelAndView.setViewName("locate/locateUpdate");
		return modelAndView;
	}
	
	@RequestMapping("/view")
	public ModelAndView view(Integer id) throws Exception {
		Locate locate = locateService.findLocateById(id);
		
		List<Relperson> relpersons = relpersonService.findRelpersonListByAddress(locate.getAddress());
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("locate", locate);
		modelAndView.addObject("relpersons", relpersons);
		modelAndView.setViewName("locate/locateView");
		return modelAndView;
	}
	
	
	@RequestMapping("/update")
	public String update(Integer id,Locate locate) throws Exception {
		locateService.updateLocateById(id,locate);
		return "op_success_child";
	}
	
	@RequestMapping("/count")
	public ModelAndView count(LocateQuery locateQuery) throws Exception {
		
		List<Locate> locateList = locateService.findLocateListByQueryMessage(locateQuery);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("locateList", locateList);
		modelAndView.setViewName("locate/locateList");
		return modelAndView;
	}


}
