package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.UserRoleMapperCustom;
import com.yz.mapper.UserroleMapper;
import com.yz.po.Userrole;
import com.yz.po.UserroleQuery;
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

	@Override
	public List<Userrole> findUserroleListByQueryMessage(UserroleQuery userroleQuery) {
		// TODO Auto-generated method stub
		return userRoleMapperCustom.findUserroleListByQueryMessage(userroleQuery);
	}

	@Override
	public void deleteUserroleById(Integer id) {
		// TODO Auto-generated method stub
		userRoleMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void insert(Userrole userrole) {
		// TODO Auto-generated method stub
		userRoleMapper.insert(userrole);
		
	}

	@Override
	public Userrole findUserroleById(Integer id) {
		// TODO Auto-generated method stub
		return userRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUserroleById(Integer id, Userrole userrole) {
		// TODO Auto-generated method stub
		userrole.setId(id);
		userRoleMapper.updateByPrimaryKeySelective(userrole);
		
		
		
	}

	@Override
	public Userrole findUserRoleByUsername(UserroleQuery userroleQuery) {
		// TODO Auto-generated method stub
		return userRoleMapperCustom.findUserRoleByUsername(userroleQuery);
	}

}
