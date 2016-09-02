package com.yz.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yz.po.Jpushperson;
import com.yz.service.JPushService;

@Controller
@RequestMapping("/push")  
public class JPushController {

	@Autowired
	private JPushService jpushService;
	
	
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
				String realFilename = UUID.randomUUID()
						+ filename.substring(filename.lastIndexOf("."));
				File file = new File(pic_path + realFilename);
				photo.transferTo(file);
				person.setPicurl(realFilename);

			}
		}
		return 1;

	}




}
