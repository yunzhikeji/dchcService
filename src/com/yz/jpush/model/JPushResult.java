package com.yz.jpush.model;

public class JPushResult {

	private int id;

	private int pushResult;//0：推送不成功，1：推送成功，-1：推送异常

	private int uploadResult;//0:上传未成功 1：上传成功

	private int checkResult;// 0:不正确,1:正确

	private String checkResultMsg;// 返回字符串

	public int getUploadResult() {
		return uploadResult;
	}

	public void setUploadResult(int uploadResult) {
		this.uploadResult = uploadResult;
	}

	public int getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(int checkResult) {
		this.checkResult = checkResult;
	}

	public String getCheckResultMsg() {
		return checkResultMsg;
	}

	public void setCheckResultMsg(String checkResultMsg) {
		this.checkResultMsg = checkResultMsg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPushResult() {
		return pushResult;
	}

	public void setPushResult(int pushResult) {
		this.pushResult = pushResult;
	}

	@Override
	public String toString() {
		return "JPushResult [id=" + id + ", pushResult=" + pushResult + ", uploadResult=" + uploadResult
				+ ", checkResult=" + checkResult + ", checkResultMsg=" + checkResultMsg + "]";
	}
	
	

}
