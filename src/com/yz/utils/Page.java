package com.yz.utils;

import java.util.List;

public class Page {
	/**
	 * 当前页码pageNo  （已知）
	 */
	private int pageNo = 1;
	
	
	/**
	 * 每页记录数pageSize(已知)
	 */
	private int pageSize = 10;
	
	/**
	 * 指定条件下的记录数 totalCount已知
	 */
	
	private int totalCount = 0;
	/**
	 * 指定条件下的总页数未知，通过计算得到
	 */
	private int totalPage = 1;
	
	/**
	 * 开始行号未知，通过计算得到
	 */
	private int startNum = 0;
	
	private List<?> list;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		totalPage = totalCount/pageSize;
		if(totalCount == 0 || totalCount%pageSize != 0) {
			totalPage++;
		}
		
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNum() {
		return (pageNo-1)*pageSize;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

}
