package com.yz.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.ClientversionMapper;
import com.yz.po.Clientversion;
import com.yz.service.ClientversionService;

public class ClientversionServiceImpl implements ClientversionService {
	@Autowired
	private ClientversionMapper clientversionMapper;

	@Override
	public Clientversion findClientversion() throws Exception {
		// TODO Auto-generated method stub
		return clientversionMapper.selectByPrimaryKey(1);
	}

	@Override
	public void updateClientversion(Clientversion clientversion) throws Exception {
		clientversion.setId(1);
		clientversionMapper.updateByPrimaryKey(clientversion);
	}

}
