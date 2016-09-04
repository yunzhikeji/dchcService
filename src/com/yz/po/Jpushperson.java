package com.yz.po;

public class Jpushperson {
	private Integer id;

	private String idcard;

	private String realname;

	private String picurl;

	private Integer istrue;

	private Integer userrole_id;

	private String checkStartTime;

	private String backCheckResultTime;

	private Integer isOutOfTime;

	public Integer getUserrole_id() {
		return userrole_id;
	}

	public void setUserrole_id(Integer userrole_id) {
		this.userrole_id = userrole_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard == null ? null : idcard.trim();
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl == null ? null : picurl.trim();
	}

	public Integer getIstrue() {
		return istrue;
	}

	public void setIstrue(Integer istrue) {
		this.istrue = istrue;
	}

	public String getCheckStartTime() {
		return checkStartTime;
	}

	public void setCheckStartTime(String checkStartTime) {
		this.checkStartTime = checkStartTime;
	}

	public String getBackCheckResultTime() {
		return backCheckResultTime;
	}

	public void setBackCheckResultTime(String backCheckResultTime) {
		this.backCheckResultTime = backCheckResultTime;
	}

	public Integer getIsOutOfTime() {
		return isOutOfTime;
	}

	public void setIsOutOfTime(Integer isOutOfTime) {
		this.isOutOfTime = isOutOfTime;
	}

}