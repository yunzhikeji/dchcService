package com.yz.po;

public class RelpersonQuery {

	private String queryMessage;

	private Integer ispermit;// 是否办理居住证(0:否 1：是)

	private Integer belongplace;// 所属社区派出所 详见“德城分局社区警务室情况（10.14）.xls”

	private Integer rtype;// 相关人员类别（0:未选择人员类型,1：房东 2：房客 3：业主 4：从业人员）

	public String getQueryMessage() {
		return queryMessage;
	}

	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}

	public Integer getBelongplace() {
		return belongplace;
	}

	public void setBelongplace(Integer belongplace) {
		this.belongplace = belongplace;
	}

	public Integer getIspermit() {
		return ispermit;
	}

	public void setIspermit(Integer ispermit) {
		this.ispermit = ispermit;
	}

	public Integer getRtype() {
		return rtype;
	}

	public void setRtype(Integer rtype) {
		this.rtype = rtype;
	}

}
