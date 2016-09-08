package com.yz.service;

import java.util.ArrayList;
import java.util.List;

import com.yz.po.Person;

public interface PersonService {
	
	//添加一个人员
	public void insert (Person person) throws Exception;
	
	//删除一个人员
	public void deletePersonById(Integer id) throws Exception;
	
	//根据id查询人员
	public Person findPersonById(Integer id) throws Exception;
	
	//人员查询列表
	public List<Person> findPersonList() throws Exception;
	
	//修改人员信息
	public void updatePerson(Integer id,Person person) throws Exception;

	//获取excel的标题数据集
	public ArrayList getExcelFieldNameList();

	public ArrayList getExcelFieldDataList() throws Exception;

}
