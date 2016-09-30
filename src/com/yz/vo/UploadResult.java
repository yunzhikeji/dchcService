package com.yz.vo;

/**
 * 客户端上传 返回信息
 * @author Administrator
 *
 */
public class UploadResult {

	private int uploadResult;// 0:上传未成功 1：上传成功
	
	public int getUploadResult() {
		return uploadResult;
	}

	public void setUploadResult(int uploadResult) {
		this.uploadResult = uploadResult;
	}

}
