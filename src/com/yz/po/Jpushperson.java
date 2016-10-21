package com.yz.po;

public class Jpushperson {
    private Integer id;

    private String idcard;

    private String realname;

    private String picurl;

    private Integer istrue;

    private Integer userroleId;

    private String checkstarttime;

    private String backcheckresulttime;

    private Integer isoutoftime;

    private String remark;

    private Integer unitname;

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

    public Integer getUnitname() {
        return unitname;
    }

    public void setUnitname(Integer unitname) {
        this.unitname = unitname;
    }
}