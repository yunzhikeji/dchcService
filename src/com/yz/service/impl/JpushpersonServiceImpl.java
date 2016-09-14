package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.JpushpersonMapper;
import com.yz.mapper.JpushpersonMapperCustom;
import com.yz.po.JpushPersonVo;
import com.yz.po.Jpushperson;
import com.yz.service.JpushpersonService;

public class JpushpersonServiceImpl implements JpushpersonService {

	@Autowired
	private JpushpersonMapper jpushpersonMapper;

	@Autowired
	private JpushpersonMapperCustom jpushpersonMapperCustom;

	@Override
	public void insert(Jpushperson person) throws Exception {
		// TODO Auto-generated method stub
		jpushpersonMapper.insert(person);

	}

	@Override
	public void deleteJPushPersonById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		jpushpersonMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Jpushperson findJPushPersonById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return jpushpersonMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Jpushperson> findJPushPersonList() throws Exception {
		// TODO Auto-generated method stub
		return jpushpersonMapperCustom.findJpushpersonList();
	}

	@Override
	public void updateJPushPerson(Integer id, Jpushperson person) throws Exception {
		// TODO Auto-generated method stub
		if(id != null) {
			person.setId(id);
			jpushpersonMapper.updateByPrimaryKeySelective(person);
		}

	}

	@Override
	public List<Jpushperson> jpushpersonCheck() throws Exception {
		return jpushpersonMapperCustom.jpushpersonCheck();
	}
	
	@Override
	public int count(Integer userroleid) throws Exception {
		return jpushpersonMapperCustom.count(userroleid);
	}

	@Override
	public List<Jpushperson> findJpushPersonByUserOnApp(JpushPersonVo jpushPersonVo) {
		 
		return jpushpersonMapperCustom.findJpushPersonByUserOnApp(jpushPersonVo);
	}
	
	

}
