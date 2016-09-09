package com.yz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.PersonMapper;
import com.yz.mapper.PersonMapperCustom;
import com.yz.po.Person;
import com.yz.service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	@Autowired
	private PersonMapperCustom personMapperCustom;

	@Override
	public void insert(Person person) throws Exception {
		personMapper.insert(person);
	}

	@Override
	public void deletePersonById(Integer id) throws Exception {
		personMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Person findPersonById(Integer id) throws Exception {
		
		return personMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Person> findPersonList() throws Exception {
		
		return personMapperCustom.findPersonList();
	}

	@Override
	public void updatePerson(Integer id, Person person) throws Exception {
		person.setId(id);
		personMapper.updateByPrimaryKeySelective(person);
		
	}

	//获取excel的标题数据集
	@Override
	public ArrayList getExcelFieldNameList() {
		String [] titles = {"人员编号","姓名","性别","出生日期","QQ","微信号","身份证号","户籍地址","现住地详址","人员分类","头像照"};
		ArrayList fieldName = new ArrayList();
		for (int i=0;i<titles.length;i++){
			String title = titles[i];
			fieldName.add(title);
		}
		return fieldName;
	}

	@Override
	public ArrayList getExcelFieldDataList() throws Exception {
		
		List<Person> personList = personMapperCustom.findPersonList();
		// 构造报表和导出数据
		ArrayList fieldData = new ArrayList();
		for(int i=0;personList !=null && i<personList.size();i++ ){
			ArrayList dataList = new ArrayList();
			Person person = personList.get(i);
			dataList.add(person.getId());
			dataList.add(person.getRealname());
			dataList.add(person.getGender());
			dataList.add(person.getBirthday());
			dataList.add(person.getQq());
			dataList.add(person.getWechat());
			dataList.add(person.getIdcard());
			dataList.add(person.getRegaddress());
			dataList.add(person.getLiveaddress());
			dataList.add(person.getCategory());
			dataList.add(person.getAvanta());
			fieldData.add(dataList);
		}
		return fieldData;
	}

	@Override
	public void truncate() {
		personMapperCustom.clean();
		
	}

}
