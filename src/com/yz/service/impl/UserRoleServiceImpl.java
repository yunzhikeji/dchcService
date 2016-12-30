package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.UserRoleMapperCustom;
import com.yz.mapper.UserroleMapper;
import com.yz.po.Userrole;
import com.yz.po.UserroleQuery;
import com.yz.service.UserRoleService;
import com.yz.utils.Page;

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
	public Page findUserroleListByQueryMessage(UserroleQuery userroleQuery) {
		
		//查询当前条件下的总记录数
		Integer totalCount = userRoleMapperCustom.findUserroleListByQueryMessageCount(userroleQuery);
		
		Page page = new Page();
		
		page.setPageNo(userroleQuery.getPageNo());
		
		page.setTotalCount(totalCount);
		//获得开始行号 
		Integer startNum = page.getStartNum();
		Integer pageSize = page.getPageSize();
		
		
		userroleQuery.setStartNum(startNum);
		userroleQuery.setPageSize(pageSize);
		
		List<UserroleQuery> userroleQueryList = userRoleMapperCustom.findUserroleListByQueryMessage(userroleQuery);
		page.setList(userroleQueryList);
		return page;
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
