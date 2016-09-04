package com.yz.service;

import java.util.List;

import com.yz.po.Jpushperson;
import com.yz.po.Userrole;

public interface JPushService {

	public void testPush(String content);
	
	public void pushCheckPersonToUser(List<Userrole> userRoles,String content);
	
	public void pushCheckResult(Userrole userrole,String content);
}
