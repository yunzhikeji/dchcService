package com.yz.mapper;

import java.util.List;

import com.yz.po.Userrole;

public interface UserRoleMapperCustom {

	Userrole findByUserNameAndPassword(Userrole userrole);
	
	List<Userrole> findUserRoleByType(int type);

	List<Userrole> findUserRoleList();

}
