package com.yz.mapper;

import java.util.List;

import com.yz.po.Person;

public interface PersonMapperCustom {
	//人员查询列表
	public List<Person> findPersonList() throws Exception;
}
