package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.RelpersonMapper;
import com.yz.mapper.RelpersonMapperCustom;
import com.yz.po.Locate;
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

	@Override
	public Relperson findRelpersonById(Integer id) {
		return relpersonMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Relperson> findRelpersonListByRelpersonQuery(Relperson relperson) {
		return relpersonMapperCustom.findRelpersonListByRelpersonQuery(relperson);
	}


	@Override
	public List<Relperson> findRelpersonListByAddress(String address) {
		// TODO Auto-generated method stub
		return relpersonMapperCustom.findRelpersonListByAddress(address);
	}

}
