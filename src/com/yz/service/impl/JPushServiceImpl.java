package com.yz.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.google.gson.JsonObject;
import com.yz.jpush.model.JPushResult;
import com.yz.po.Userrole;
import com.yz.service.JPushService;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.audience.AudienceTarget;
import cn.jpush.api.push.model.notification.Notification;

public class JPushServiceImpl implements JPushService {

	private Logger logger = Logger.getLogger("JPushServiceImpl");

	private String masterSecret;
	private String appKey;

	@Override
	public void testPush(String content) {
		JPushClient jpushClient = new JPushClient(masterSecret, appKey);
		PushPayload payload = buildPushObject_all_all_alert(content);
		try {
			PushResult result = jpushClient.sendPush(payload);
			System.out.println(result);
			logger.info("Got result - " + result);

		} catch (APIConnectionException e) {
			logger.error("Connection error, should retry later", e);
		} catch (APIRequestException e) {
			logger.error("Should review the error, and fix the request", e);
			logger.info("HTTP Status: " + e.getStatus());
			logger.info("Error Code: " + e.getErrorCode());
			logger.info("Error Message: " + e.getErrorMessage());
		}
	}

	@Override
	public JPushResult pushCheckPersonToUser(List<Userrole> userRoles,String content,JPushResult jPushResult) {
		
		jPushResult.setUploadResult(1);
		jPushResult = this.push(userRoles, content,jPushResult);
		return jPushResult;
	}
	
	
	@Override
	public JPushResult pushCheckResult(Userrole userrole,String content,JPushResult jPushResult) {
		List<Userrole> userroles = new ArrayList<Userrole>();
		userroles.add(userrole);
		jPushResult.setUploadResult(1);
		jPushResult = this.push(userroles, content,jPushResult);
		return jPushResult;
	}
	
	
	public JPushResult push(List<Userrole> userRoles,String content,JPushResult jPushResult) {
		JPushClient jpushClient = new JPushClient(masterSecret, appKey);
		
		List<String> aliases = new ArrayList<String>();
		if(userRoles!=null)
		{
			for(Userrole userRole:userRoles)
			{
				aliases.add(userRole.getUsername());
			}
		}
		PushPayload payload = buildPushObject_andorid_alias_alert(aliases,content);
		try {
			PushResult result = jpushClient.sendPush(payload);
			
			jPushResult.setPushResult(1);
			if(result.toString().contains("error"))
			{
				jPushResult.setPushResult(-1);
			}
			logger.info("Got result - " + result);
		} catch (APIConnectionException e) {
			logger.error("Connection error, should retry later", e);
		} catch (APIRequestException e) {
			logger.error("Should review the error, and fix the request", e);
			logger.info("HTTP Status: " + e.getStatus());
			logger.info("Error Code: " + e.getErrorCode());
			logger.info("Error Message: " + e.getErrorMessage());
		}
		
		return jPushResult;

	}

	public PushPayload buildPushObject_all_all_alert(String content) {
		return PushPayload.alertAll(content);
	}

	public static PushPayload buildPushObject_andorid_alias_alert(List<String> aliases, String content) {
		return PushPayload.newBuilder().setPlatform(Platform.android())
				.setAudience(Audience.newBuilder().addAudienceTarget(AudienceTarget.alias(aliases)).build())
				.setNotification(Notification.alert(content)).build();
	}

	public String getMasterSecret() {
		return masterSecret;
	}

	public void setMasterSecret(String masterSecret) {
		this.masterSecret = masterSecret;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}


}
