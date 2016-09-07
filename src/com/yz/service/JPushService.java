package com.yz.service;

import java.util.List;

import com.yz.jpush.model.JPushResult;
import com.yz.po.Userrole;

public interface JPushService {

	public void testPush(String content);
	
	public JPushResult pushCheckPersonToUser(List<Userrole> userRoles,String content,JPushResult jPushResult);
	
	public JPushResult pushCheckResult(Userrole userrole,String content,JPushResult jPushResult);
}
