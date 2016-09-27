package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.RelpersonMapper;
import com.yz.mapper.RelpersonMapperCustom;
import com.yz.po.Relperson;
import com.yz.service.RelpersonService;

public class RelpersonServiceImpl implements RelpersonService {

	@Autowired
	private RelpersonMapper relpersonMapper;

	@Autowired
	private RelpersonMapperCustom relpersonMapperCustom;

	@Override
	public void insert(Relperson relperson) {
		// TODO Auto-generated method stub
		relpersonMapper.insert(relperson);
	}

	@Override
	public List<Relperson> findRelpersonList() {
		// TODO Auto-generated method stub
		return relpersonMapperCustom.findRelpersonList();
	}

	@Override
	public void deleteRelpersonById(Integer id) {
		// TODO Auto-generated method stub
		relpersonMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateRelpersonById(Integer id,Relperson relperson) {
		// TODO Auto-generated method stub
		relperson.setId(id);
		relpersonMapper.updateByPrimaryKeySelective(relperson);
	}

}
