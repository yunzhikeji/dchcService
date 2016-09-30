package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.LocateMapper;
import com.yz.mapper.LocateMapperCustom;
import com.yz.po.Locate;
import com.yz.service.LocateService;

public class LocateServiceImpl implements LocateService {

	@Autowired
	private LocateMapper locateMapper;

	@Autowired
	private LocateMapperCustom locateMapperCustom;

	@Override
	public void insert(Locate locate) {
		// TODO Auto-generated method stub
		locateMapper.insert(locate);
	}

	@Override
	public List<Locate> findLocateList() {
		// TODO Auto-generated method stub
		return locateMapperCustom.findLocateList();
	}

	@Override
	public void deleteLocateById(Integer id) {
		// TODO Auto-generated method stub
		locateMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateLocateById(Integer id,Locate locate) {
		// TODO Auto-generated method stub
		locate.setId(id);
		locateMapper.updateByPrimaryKeySelective(locate);
	}

	@Override
	public Locate findLocateById(Integer id) {
		// TODO Auto-generated method stub
		return locateMapper.selectByPrimaryKey(id);
	}

}
