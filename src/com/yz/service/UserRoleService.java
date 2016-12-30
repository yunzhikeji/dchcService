package com.yz.service;

import java.util.List;

import com.yz.po.Userrole;
import com.yz.po.UserroleQuery;
import com.yz.utils.Page;

public interface UserRoleService {


	// 根据id查询用户
	public Userrole findUserRoleById(Integer id) throws Exception;
	
	// 用户查询列表
	public List<Userrole> findUserRoleList() throws Exception;
	
	//验证用户登录
	public Userrole findByUserNameAndPassword(Userrole userrole) throws Exception;

	//根据类型查询用户列表
	public List<Userrole> findUserRoleByType(int type);

	//根据前台所传查询条件，查询用户列表
	public Page findUserroleListByQueryMessage(UserroleQuery userroleQuery);

	//根据id删除用户
	public void deleteUserroleById(Integer id);

	//新增用户
	public void insert(Userrole userrole);

	//根据id查询用户
	public Userrole findUserroleById(Integer id);

	//修改用户
	public void updateUserroleById(Integer id, Userrole userrole);

	//根据用户名查询用户
	public Userrole findUserRoleByUsername(UserroleQuery userroleQuery);
	
	

}
