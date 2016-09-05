package com.yz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yz.service.UserRoleService;

@Controller
@RequestMapping("/user")
public class UserRoleController {
	@Autowired
	private UserRoleService userService;

//	@RequestMapping("/queryUsers")
//	public ModelAndView queryUsers(HttpServletRequest request) throws Exception {
//
//		// 调用service查询数据库，查询用户列表
//		List<User> userList = userService.findUserList();
//		// 返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//
//		modelAndView.addObject("userList", userList);
//		modelAndView.setViewName("user");
//		return modelAndView;
//
//	}

//	@RequestMapping("/addUser")
//	public @ResponseBody User addUser(User user, MultipartFile facepic, MultipartFile bodyphoto) throws Exception {
//		// 存储图片的物理路径
//		String pic_path = "C:\\develop\\upload\\temp\\";
//		if (facepic != null) {
//			String originalFacepicFilename = facepic.getOriginalFilename();
//			// 上传图片
//			if (originalFacepicFilename != null && originalFacepicFilename.length() > 0) {
//				// 存储图片的物理路径
//
//				// 新的图片名称
//				String newFacepicFilename = UUID.randomUUID()
//						+ originalFacepicFilename.substring(originalFacepicFilename.lastIndexOf("."));
//				// 新图片
//				File newFacepicFile = new File(pic_path + newFacepicFilename);
//
//				// 将内存中的数据写入磁盘
//				facepic.transferTo(newFacepicFile);
//
//				// 将新图片名称写到user中
//				user.setAvanta(newFacepicFilename);
//
//			}
//		}
//		
//		
//		if (bodyphoto != null) {
//			String originalBodyphotoFilename = bodyphoto.getOriginalFilename();
//			if (originalBodyphotoFilename != null && originalBodyphotoFilename.length() > 0) {
//
//				// 新的图片名称
//				String newBodyphotoFilename = UUID.randomUUID()
//						+ originalBodyphotoFilename.substring(originalBodyphotoFilename.lastIndexOf("."));
//				// 新图片
//				File newBodyphotoFile = new File(pic_path + newBodyphotoFilename);
//
//				// 将内存中的数据写入磁盘
//				bodyphoto.transferTo(newBodyphotoFile);
//
//				// 将新图片名称写到user中
//				user.setBodypic(newBodyphotoFilename);
//
//			}
//		}
//
//		userService.insert(user);
//		User ur = new User();
//		ur.setId(-1);
//		return ur;
//
//	}

	@RequestMapping("/editUserUI")
	public String editUser(HttpServletRequest request) throws Exception {
		return "userEdit";

	}

}
