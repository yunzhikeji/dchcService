package com.yz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yz.po.Userrole;
import com.yz.service.UserRoleService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserRoleService userRoleService;
	// 登陆
	@RequestMapping("/login/{username}/{password}")
	public @ResponseBody Userrole login(@PathVariable("username") String username,@PathVariable("password") String password)
			throws Exception {
		Userrole userrole = new Userrole();
		userrole.setUsername(username);
		userrole.setPassword(password);
		// 调用service进行用户身份验证
		Userrole userQuery = userRoleService.findByUserNameAndPassword(userrole);
		if (userQuery == null){
			Userrole ur = new Userrole();
			ur.setUnitid(-1);
			return ur;
		}
		else
//		if (userQuery == null){
//			model.addAttribute("loginError", "用户名或密码不正确！");
//		return "login";	
//		}else{
//		// 在session中保存用户身份信息
//		session.setAttribute("username", userQueryVo.getUser().getUsername());
//		// 重定向到商品列表页面
		return userQuery;
		}
	
	
	//页面登录
	@RequestMapping("/weblogin")
	public String weblogin(HttpSession session,Userrole userrole,Model model) throws Exception{
		// 调用service进行用户身份验证
		Userrole userQuery = userRoleService.findByUserNameAndPassword(userrole);
		if (userQuery == null){
			model.addAttribute("loginError", "用户名或密码不正确！");
		return "login";	
		}else{
		// 在session中保存用户身份信息
		session.setAttribute("username", userrole.getUsername());
		session.setAttribute("jobnumber",userQuery.getJobnumber());
		session.setAttribute("type",userQuery.getType());
		// 重定向到主页面
		return "redirect:/login/index.action";
		}
	}

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/index";
	}
	
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request,HttpSession session) throws Exception {
		
		System.out.println(request.getServletContext());

		return "index";
	}
	
	

}
