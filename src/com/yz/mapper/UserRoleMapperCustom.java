package com.yz.mapper;

import com.yz.po.Userrole;

public interface UserRoleMapperCustom {

	Userrole findByUserNameAndPassword(Userrole userrole);

}
