package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.LocateMapper;
import com.yz.mapper.LocateMapperCustom;
import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.po.Relperson;
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

	@Override
	public List<Locate> findLocateListByQueryMessage(LocateQuery locateQuery) {
		// TODO Auto-generated method stub
		return locateMapperCustom.findLocateListByQueryMessage(locateQuery);
	}
	
	@Override
	public Locate getRealLocate(Integer addressType,String addressMsg) {
		// TODO Auto-generated method stub
		
		Locate locate = null;
		
		if(addressMsg!=null&&!addressMsg.trim().equals(""))
		{
			Relperson relperson = new Relperson();
			if(addressType==1)
			{
				relperson.setCurrentaddress(addressMsg);
			}
			else
			{
				relperson.setWorkdunitaddress(addressMsg);
			}
			 List<Locate> locates = locateMapperCustom.findLocateListByRelperson(relperson);
			 if(locates!=null&&locates.size()>0)
			 {
				 locate = locates.get(0);
			 }
		}
		return locate;
	}

}
