package com.yz.mapper;

import java.util.List;

import com.yz.po.Userrole;
import com.yz.po.UserroleQuery;

public interface UserRoleMapperCustom {

	Userrole findByUserNameAndPassword(Userrole userrole);
	
	List<Userrole> findUserRoleByType(int type);

	List<Userrole> findUserRoleList();

	List<UserroleQuery> findUserroleListByQueryMessage(UserroleQuery userroleQuery);
	
	Integer findUserroleListByQueryMessageCount(UserroleQuery userroleQuery);
	
	Userrole findUserRoleByUsername(UserroleQuery userroleQuery);

}
