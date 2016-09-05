package com.yz.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yz.po.Jpushperson;
import com.yz.po.Userrole;
import com.yz.service.JPushService;
import com.yz.service.JpushpersonService;
import com.yz.utils.DateTimeKit;

@Controller
@RequestMapping("/push")
public class JPushController {

	@Autowired
	private JPushService jpushService;

	@Autowired
	private JpushpersonService personService;

	@RequestMapping(value = "test")
	public String test() throws Exception {

		String content = "1231231";
		jpushService.testPush(content);
		return null;
	}

	@RequestMapping("/check")
	public @ResponseBody int checkPerson(Jpushperson person, MultipartFile photo) throws Exception {
		// 存储图片的物理路径
		String pic_path = "C:\\develop\\upload\\temp\\";
		if (photo != null) {
			String filename = photo.getOriginalFilename();
			if (filename != null && filename.length() > 0) {
				String realFilename = UUID.randomUUID() + filename.substring(filename.lastIndexOf("."));
				File file = new File(pic_path + realFilename);
				photo.transferTo(file);
				person.setPicurl(realFilename);

			}
		}
		// 插入人员数据库
		// 改检查人员表中包含上传用户的用户名，作为推送的别名，以后使用进行下发,同时记录当前时间
		
		String checkStartTime = DateTimeKit.getLocal_Time();
		person.setCheckstarttime(checkStartTime);
		personService.insert(person);

		String content = "最新消息：判断人员信息是否准确";

		// 查询出userRole的type=1说明是大厅用户，需要下发
		List<Userrole> userRoles = new ArrayList<Userrole>();

		jpushService.pushCheckPersonToUser(userRoles, content);

		return 1;
	}

	@RequestMapping("/result")
	public @ResponseBody String result(Integer pid,Jpushperson person, Integer isTrue) throws Exception {

		person.setIstrue(isTrue);
		
		String backCheckResultTime  = DateTimeKit.getLocal_Time();
		
		person.setBackcheckresulttime(backCheckResultTime);
		
		int isOutOfTime = (DateTimeKit.minutesBetweenStr(person.getCheckstarttime(), backCheckResultTime)-10);
		
		if(isOutOfTime>0)
		{
			person.setIsoutoftime(1);//大于10 就说明超期了
		}else
		{
			person.setIsoutoftime(0);
		}

		personService.updateJPushPerson(pid, person);

		String content = "人员信息:姓名为"+person.getRealname()+",身份证为:"+person.getIdcard();
		if (isTrue == 1) {
			content = content + "正确";
		} else {
			content = content + "不正确";
		}

		Userrole userRole = new Userrole();// 这里是查询，根据person的userrole_id查询出Userrole

		jpushService.pushCheckResult(userRole, content);

		return "1";// 这里是跳转到一个页面

	}

}
