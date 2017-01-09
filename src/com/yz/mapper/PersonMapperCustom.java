package com.yz.mapper;

import java.util.List;

import com.yz.po.Person;
import com.yz.po.PersonQuery;

public interface PersonMapperCustom {
	//人员查询列表
	public List<Person> findPersonList() throws Exception;
	
	//清空
	public void clean();
	
	//按条件查询人员列表
	public List<Person> findPersonListByPersonQuery(PersonQuery personQuery);
	

}
