package com.yz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yz.po.User;
import com.yz.po.Userrole;
import com.yz.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	// 登陆
	@RequestMapping("/login/{username}/{password}")
	public @ResponseBody Userrole login(@PathVariable("username") String username,@PathVariable("password") String password)
			throws Exception {
		Userrole user = new Userrole();
		user.setUsername(username);
		user.setPassword(password);
		// 调用service进行用户身份验证
		
		Userrole userQuery = userService.findByUserNameAndPassword(user);
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
	

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/login";
	}

}
