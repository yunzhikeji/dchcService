package com.yz.jpush.model;

public class JPushResult {

	private int checkResult;// 0:不正确,1:正确

	private String checkResultMsg;// 返回字符串

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

}
