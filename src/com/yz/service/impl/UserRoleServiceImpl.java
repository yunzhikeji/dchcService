package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.UserRoleMapperCustom;
import com.yz.po.Userrole;
import com.yz.service.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleMapperCustom userRoleMapperCustom;

	@Override
	public Userrole findUserById(Integer id) throws Exception {
		return null;
	}

	@Override
	public List<Userrole> findUserList() throws Exception {

		return null;
	}

	@Override
	public Userrole findByUserNameAndPassword(Userrole userrole) throws Exception {

		Userrole userQuery = userRoleMapperCustom.findByUserNameAndPassword(userrole);

		return userQuery;
	}

	@Override
	public List<Userrole> findUserByType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
