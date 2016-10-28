package com.yz.po;

public class Person {
	private Integer id;

	private String realname;

	private String gender;// 1:男 2:女

	private String birthday;

	private String qq;

	private String wechat;

	private String idcard;

	private String phone;

	private String regaddress;

	private String otherinfo;

	private String liveaddress;

	private String creditcard;

	private String carid;

	private String scene;

	private String category;

	private String avanta;

	private String bodypic;

	private Integer unitname;// 上传部门
	/*
	 * 1 剪子股派出所 2 黄河涯派出所 3 东地派出所 4 新河东路派出所 5 于官屯派出所 6 建设街派出所 7 车站街派出所 8 湖滨北路派出所
	 * 9 二屯派出所 10 长庄派出所 11 刑警大队 12 巡警大队 13 治安大队 14 经侦大队
	 */

	public Integer getId() {
		return id;
	}

	public Integer getUnitname() {
		return unitname;
	}

	public void setUnitname(Integer unitname) {
		this.unitname = unitname;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
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

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard == null ? null : idcard.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getRegaddress() {
		return regaddress;
	}

	public void setRegaddress(String regaddress) {
		this.regaddress = regaddress == null ? null : regaddress.trim();
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo == null ? null : otherinfo.trim();
	}

	public String getLiveaddress() {
		return liveaddress;
	}

	public void setLiveaddress(String liveaddress) {
		this.liveaddress = liveaddress == null ? null : liveaddress.trim();
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard == null ? null : creditcard.trim();
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid == null ? null : carid.trim();
	}

	public String getScene() {
		return scene;
	}

	public void setScene(String scene) {
		this.scene = scene == null ? null : scene.trim();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category == null ? null : category.trim();
	}

	public String getAvanta() {
		return avanta;
	}

	public void setAvanta(String avanta) {
		this.avanta = avanta == null ? null : avanta.trim();
	}

	public String getBodypic() {
		return bodypic;
	}

	public void setBodypic(String bodypic) {
		this.bodypic = bodypic == null ? null : bodypic.trim();
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Person)) {
			return false;
		}

		Person person = (Person) obj;

		if (this.realname == null) {
			if (person.realname != null) {
				return false;
			}
		} else if (!this.realname.replace(" ", "").equals(person.realname.replace(" ", ""))) {
			return false;
		}

		if (this.idcard == null) {
			if (person.idcard != null) {
				return false;
			}
		} else if (!this.idcard.replace(" ", "").equals(person.idcard.replace(" ", ""))) {
			return false;
		}

		return true;
	}

}