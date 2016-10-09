package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Userrole;
import com.yz.po.UserroleQuery;
import com.yz.service.UserRoleService;

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
		modelAndView.setViewName("user/userroleList");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		userroleService.deleteUserroleById(id);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() throws Exception {
		return "user/userroleAdd";
		
	}
	
	@RequestMapping("/add")
	public String add(Userrole userrole) throws Exception {
		
		userrole.setType(0);//大厅type为1
		userrole.setUnitid(1);//大厅部门为2 
		userroleService.insert(userrole);
		return "op_success_child";
	}
	
	@RequestMapping("/load")
	public ModelAndView load(Integer id) throws Exception {
		Userrole userrole = userroleService.findUserroleById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userrole", userrole);
		modelAndView.setViewName("user/userroleUpdate");
		return modelAndView;
	}
	
	@RequestMapping("/view")
	public ModelAndView view(Integer id) throws Exception {
		Userrole userrole = userroleService.findUserroleById(id);
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userrole", userrole);
		modelAndView.setViewName("user/userroleView");
		return modelAndView;
	}
	
	
	@RequestMapping("/update")
	public String update(Integer id,Userrole userrole) throws Exception {
		userroleService.updateUserroleById(id,userrole);
		return "op_success_child";
	}
	
	
	@RequestMapping("/checkUsername")
	public @ResponseBody Userrole checkUsername(UserroleQuery userroleQuery,Integer id) throws Exception {
		
		Userrole userrole = userroleService.findUserRoleByUsername(userroleQuery);
		
		if(userrole!=null&&userrole.getId()!=id)
		{
			return userrole;
		}
		return null;
	}
	
	
	


}
