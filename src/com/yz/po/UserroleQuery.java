package com.yz.po;

public class UserroleQuery extends Userrole {

	private Integer startNum;  //开始行号
	
	private Integer pageSize; // 每页显示多少条记录
	
	private Integer pageNo;

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}  

	
}