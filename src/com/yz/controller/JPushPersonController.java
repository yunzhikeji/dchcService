package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yz.po.Jpushperson;
import com.yz.service.JpushpersonService;

@Controller
public class JPushPersonController {

	@Autowired
	private JpushpersonService jpushpersonService;

	@RequestMapping("/jpushpersons")
	public List<Jpushperson> findJPushPersonList() throws Exception {
		return jpushpersonService.findJPushPersonList();
	}

}
