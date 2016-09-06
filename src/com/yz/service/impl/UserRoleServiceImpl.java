package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.UserRoleMapperCustom;
import com.yz.mapper.UserroleMapper;
import com.yz.po.Userrole;
import com.yz.service.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	UserroleMapper userRoleMapper;

	@Autowired
	UserRoleMapperCustom userRoleMapperCustom;

	@Override
	public Userrole findUserRoleById(Integer id) throws Exception {
		
		return userRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Userrole> findUserRoleList() throws Exception {
		

		return userRoleMapperCustom.findUserRoleList();
	}

	@Override
	public Userrole findByUserNameAndPassword(Userrole userrole) throws Exception {

		Userrole userQuery = userRoleMapperCustom.findByUserNameAndPassword(userrole);

		return userQuery;
	}

	@Override
	public List<Userrole> findUserRoleByType(int type) {
		
		return userRoleMapperCustom.findUserRoleByType(type);
	}

}
