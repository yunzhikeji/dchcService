package com.yz.po;


public class RelpersonVO extends Relperson{
	
	private String liveLocation;
	
	private String workLocation;
	
	private Integer startNum;  //开始行号
	
	private Integer pageSize; // 每页显示多少条记录
	
	private Integer pageNo;  

	public String getLiveLocation() {
		return liveLocation;
	}

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

	public void setLiveLocation(String liveLocation) {
		this.liveLocation = liveLocation;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

}
