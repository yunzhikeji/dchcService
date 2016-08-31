package com.yz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yz.po.Clientversion;
import com.yz.service.ClientversionService;

@Controller
public class ClientversionController {
	
	@Autowired
	private ClientversionService clientversionService;
	
	@RequestMapping("/appversion")
	public @ResponseBody Clientversion getVersion() throws Exception {
		
		Clientversion clientversion = clientversionService.findClientversion();
		return clientversion;
		
	}

}
