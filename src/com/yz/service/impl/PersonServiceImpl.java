package com.yz.service.impl;

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

}
