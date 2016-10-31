package com.yz.po;

public class LocateQuery {

	private String queryMessage;

	private Integer islethouse;// 是否出租房(0:否 1：是)

	private Integer belongplace;// 所属社区派出所 详见“德城分局社区警务室情况（10.14）.xls”

	private Integer placetype;// 场所性质(1:娱乐场所 2：服务场所 3：特种行业 4：九小场所 5：物流快递)

	public String getQueryMessage() {
		return queryMessage;
	}

	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}

	public Integer getIslethouse() {
		return islethouse;
	}

	public void setIslethouse(Integer islethouse) {
		this.islethouse = islethouse;
	}

	public Integer getBelongplace() {
		return belongplace;
	}

	public void setBelongplace(Integer belongplace) {
		this.belongplace = belongplace;
	}

	public Integer getPlacetype() {
		return placetype;
	}

	public void setPlacetype(Integer placetype) {
		this.placetype = placetype;
	}

}
