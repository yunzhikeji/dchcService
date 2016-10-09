package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Userrole;
import com.yz.po.Relperson;
import com.yz.service.UserRoleService;
import com.yz.utils.DateTimeKit;

@Controller
@RequestMapping("/user")
public class UserRoleController {
	@Autowired
	private UserRoleService userroleService;
	
	
	@RequestMapping("/list")
	public ModelAndView list(UserroleQuery userroleQuery) throws Exception {
		
		List<Userrole> userroleList = userroleService.findUserroleListByQueryMessage(userroleQuery);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userroleList", userroleList);
		modelAndView.setViewName("userrole/userroleList");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		userroleService.deleteUserroleById(id);
		return "redirect:/userrole/list";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() throws Exception {
		return "userrole/userroleAdd";
		
	}
	
	@RequestMapping("/add")
	public String add(Userrole userrole) throws Exception {
		
		userrole.setUploadtime(DateTimeKit.getLocal_Time());//设置上传时间
		userroleService.insert(userrole);
		return "op_success_child";
	}
	
	@RequestMapping("/load")
	public ModelAndView load(Integer id) throws Exception {
		Userrole userrole = userroleService.findUserroleById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userrole", userrole);
		modelAndView.setViewName("userrole/userroleUpdate");
		return modelAndView;
	}
	
	@RequestMapping("/view")
	public ModelAndView view(Integer id) throws Exception {
		Userrole userrole = userroleService.findUserroleById(id);
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userrole", userrole);
		modelAndView.addObject("relpersons", relpersons);
		modelAndView.setViewName("userrole/userroleView");
		return modelAndView;
	}
	
	
	@RequestMapping("/update")
	public String update(Integer id,Userrole userrole) throws Exception {
		userroleService.updateUserroleById(id,userrole);
		return "op_success_child";
	}



}
