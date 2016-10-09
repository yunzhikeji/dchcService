package com.yz.controller;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yz.jpush.model.JPushResult;
import com.yz.po.Jpushperson;
import com.yz.po.Userrole;
import com.yz.service.JPushService;
import com.yz.service.JpushpersonService;
import com.yz.service.UserRoleService;
import com.yz.utils.DateTimeKit;

@Controller
@RequestMapping("/push")
public class JPushController {

	@Autowired
	private JPushService jpushService;

	@Autowired
	private JpushpersonService jpushpersonService;

	@Autowired
	private UserRoleService userRoleService;

	@RequestMapping(value = "test")
	public String test() throws Exception {

		String content = "1231231";
		jpushService.testPush(content);
		return null;
	}

	@RequestMapping("/check")
	public @ResponseBody JPushResult checkPerson(Jpushperson person, MultipartFile facepic) throws Exception {
		// 存储图片的物理路径

		JPushResult jPushResult = new JPushResult();
		String pic_path = "/home/develop/upload/temp/";
		if (facepic != null) {
			String filename = facepic.getOriginalFilename();
			if (filename != null && filename.length() > 0) {
				String realFilename = UUID.randomUUID() + filename.substring(filename.lastIndexOf("."));
				File file = new File(pic_path + realFilename);
				facepic.transferTo(file);
				person.setPicurl(realFilename);
			}
		}
		// 插入人员数据库
		// 改检查人员表中包含上传用户的用户名，作为推送的别名，以后使用进行下发,同时记录当前时间

		String checkStartTime = DateTimeKit.getLocal_Time();
		person.setCheckstarttime(checkStartTime);
		person.setIstrue(0);
		jpushpersonService.insert(person);

		String content = "最新消息：判断人员信息是否准确";

		// 查询出userRole的type=1说明是大厅用户，需要下发
		int type = 1;
		List<Userrole> userRoles = userRoleService.findUserRoleByType(type);

		jPushResult = jpushService.pushCheckPersonToUser(userRoles, content, jPushResult);
		
		System.out.println("jPushResult:"+jPushResult);

		return jPushResult;
	}

	@RequestMapping("/result")
	public String result(Integer id, Integer istrue, String remark) throws Exception {
		
		if (remark != null && !remark.equals("")) {
			remark = URLDecoder.decode(remark, "utf-8");
		}

		JPushResult jPushResult = new JPushResult();

		Jpushperson person = jpushpersonService.findJPushPersonById(id);

		System.out.println("remark" + remark);

		person.setIstrue(istrue);
		person.setRemark(remark);

		String backCheckResultTime = DateTimeKit.getLocal_Time();

		person.setBackcheckresulttime(backCheckResultTime);

		int isOutOfTime = 0;
		if (person.getCheckstarttime() != null && !person.getCheckstarttime().replace(" ", "").equals("")) {
			isOutOfTime = (DateTimeKit.minutesBetweenStr(person.getCheckstarttime(), backCheckResultTime) - 10);
		}

		if (isOutOfTime > 0) {
			person.setIsoutoftime(1);// 大于10 就说明超期了
		} else {
			person.setIsoutoftime(0);
		}

		jpushpersonService.updateJPushPerson(id, person);

		String content = "姓名:" + person.getRealname() + ",信息";
		if (istrue == 1) {
			content = content + "正确";
		} else if(istrue==2){
			content = content + "不正确";
		}
		if (remark != null && !remark.equals("")) {
			content = content + "备注:" + remark;
		}

		Userrole userRole = userRoleService.findUserRoleById(person.getUserroleId());// 这里是查询，根据person的userroleid查询出Userrole

		jpushService.pushCheckResult(userRole, content, jPushResult);

		return "redirect:/jcheck";// 这里是跳转到一个页面

	}

	@RequestMapping("/jpushpersons")
	public String index(HttpSession session) throws Exception {

		return "jpushpersons";
	}

}
