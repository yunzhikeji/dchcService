package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.UserMapper;
import com.yz.mapper.UserMapperCustom;
import com.yz.po.User;
import com.yz.po.UserCustom;
import com.yz.po.UserQueryVo;
import com.yz.po.Userrole;
import com.yz.service.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserMapperCustom userMapperCustom;

	@Override
	public Userrole findUserById(Integer id) throws Exception {
		return null;
	}

	@Override
	public List<Userrole> findUserList() throws Exception {

		return null;
	}

	@Override
	public Userrole findByUserNameAndPassword(Userrole user) throws Exception {

		Userrole userQuery = userMapperCustom.findByUserNameAndPassword(user);

		return userQuery;
	}

	@Override
	public List<Userrole> findUserByType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
