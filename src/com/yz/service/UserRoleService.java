package com.yz.service;

import java.util.List;

import com.yz.po.User;
import com.yz.po.Userrole;

public interface UserRoleService {


	// 根据id查询用户
	public Userrole findUserById(Integer id) throws Exception;
	
	// 用户查询列表
	public List<Userrole> findUserList() throws Exception;
	
	//验证用户登录
	public Userrole findByUserNameAndPassword(Userrole userrole) throws Exception;

	public List<Userrole> findUserByType(int type);

}
