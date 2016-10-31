package com.yz.po;

public class Relperson {
	private Integer id;// 相关人员id

	private Integer rtype;// 相关人员类别（0:未选择人员类型,1：房东 2：房客 3：业主 4：从业人员）

	private String name;// 姓名

	private Integer sex;// 性别(1:男 2：女)

	private String nation;// 民族

	private String idcard;// 身份证号

	private String birthday;// 出身日期

	private String qq;// qq

	private String wechat;// 微信号

	private String registeraddress;// 户籍所在地址

	private String currentaddress;// 现居住地址(用于与场所地址比较)

	private String workdunit;// 工作单位名称

	private String workdunitaddress;// 工作单位地址(用于与场所地址比较)

	private String telphone;// 联系电话

	private Integer ispermit;// 是否办理居住证(0:否 1：是)

	private Integer belongplace;// 所属社区派出所 详见“德城分局社区警务室情况（10.14）.xls”
	
	private Integer policeroom; //所属警务室 详见“德城分局社区警务室情况（10.14）.xls”

	private String remark;// 备注

	private String uploadtime;//上传时间
	
    private String propertyandequipment;//资产

    private String position; //职务

    private String platenumber;//车牌号码
    
    private String relationshipwithlandlord;//与承租人的关系
    
    
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

	public Integer getBelongplace() {
		return belongplace;
	}

	public void setBelongplace(Integer belongplace) {
		this.belongplace = belongplace;
	}
	

	public Integer getPoliceroom() {
		return policeroom;
	}

	public void setPoliceroom(Integer policeroom) {
		this.policeroom = policeroom;
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

	public String getPropertyandequipment() {
		return propertyandequipment;
	}

	public void setPropertyandequipment(String propertyandequipment) {
		this.propertyandequipment = propertyandequipment == null ? null : propertyandequipment.trim();
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	public String getPlatenumber() {
		return platenumber;
	}

	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber == null ? null : platenumber.trim();
	}

	public String getRelationshipwithlandlord() {
		return relationshipwithlandlord;
	}

	public void setRelationshipwithlandlord(String relationshipwithlandlord) {
		this.relationshipwithlandlord = relationshipwithlandlord == null ? null : relationshipwithlandlord.trim();
	}
	
	
	
	
}