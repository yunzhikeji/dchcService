package com.yz.po;

public class Jpushperson {
	private Integer id;

	private String idcard;// 身份证

	private String realname;// 真实姓名

	private String picurl;// 人脸照片地址

	private Integer istrue;// 判断接口（0:未处理，1：已处理(正确),2:已处理（错误）,其他：错误）

	private Integer userroleId;// 客户端用户id

	private String checkstarttime;// 客户端前端上传判断信息时间

	private String backcheckresulttime;// 平台判断后下发时间

	private Integer isoutoftime;// 是否超期

	private String remark;// 备注

	private Integer unitname;// 上传部门 
	/*
	1	剪子股派出所	
	2	黄河涯派出所	
	3	东地派出所	
	4	新河东路派出所	
	5	于官屯派出所	
	6	建设街派出所	
	7	车站街派出所	
	8	湖滨北路派出所	
	9	二屯派出所	
	10	长庄派出所	
	11	刑警大队	
	12	巡警大队	
	13	治安大队	
	14	经侦大队	
	*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdcard() {
		return idcard;
	}

	public Integer getUnitname() {
		return unitname;
	}

	public void setUnitname(Integer unitname) {
		this.unitname = unitname;
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

	public Integer getUserroleId() {
		return userroleId;
	}

	public void setUserroleId(Integer userroleId) {
		this.userroleId = userroleId;
	}

	public String getCheckstarttime() {
		return checkstarttime;
	}

	public void setCheckstarttime(String checkstarttime) {
		this.checkstarttime = checkstarttime == null ? null : checkstarttime.trim();
	}

	public String getBackcheckresulttime() {
		return backcheckresulttime;
	}

	public void setBackcheckresulttime(String backcheckresulttime) {
		this.backcheckresulttime = backcheckresulttime == null ? null : backcheckresulttime.trim();
	}

	public Integer getIsoutoftime() {
		return isoutoftime;
	}

	public void setIsoutoftime(Integer isoutoftime) {
		this.isoutoftime = isoutoftime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

}