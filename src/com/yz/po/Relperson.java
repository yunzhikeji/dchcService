package com.yz.po;

public class Relperson {
    private Integer id;

    private Integer rtype;

    private String name;

    private Integer sex;

    private String nation;

    private String idcard;

    private String birthday;

    private String qq;

    private String wechat;

    private String registeraddress;

    private String currentaddress;

    private String workdunit;

    private String workdunitaddress;

    private String telphone;

    private Integer ispermit;

    private String belongplace;

    private String uploadtime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getRegisteraddress() {
        return registeraddress;
    }

    public void setRegisteraddress(String registeraddress) {
        this.registeraddress = registeraddress == null ? null : registeraddress.trim();
    }

    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress == null ? null : currentaddress.trim();
    }

    public String getWorkdunit() {
        return workdunit;
    }

    public void setWorkdunit(String workdunit) {
        this.workdunit = workdunit == null ? null : workdunit.trim();
    }

    public String getWorkdunitaddress() {
        return workdunitaddress;
    }

    public void setWorkdunitaddress(String workdunitaddress) {
        this.workdunitaddress = workdunitaddress == null ? null : workdunitaddress.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getIspermit() {
        return ispermit;
    }

    public void setIspermit(Integer ispermit) {
        this.ispermit = ispermit;
    }

    public String getBelongplace() {
        return belongplace;
    }

    public void setBelongplace(String belongplace) {
        this.belongplace = belongplace == null ? null : belongplace.trim();
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}