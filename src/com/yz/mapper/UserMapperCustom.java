package com.yz.mapper;

import com.yz.po.User;
import com.yz.po.UserCustom;
import com.yz.po.UserQueryVo;
import com.yz.po.Userrole;

import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public interface UserMapperCustom {
	public Userrole findByUserNameAndPassword(Userrole user) throws Exception;
	
	//用户查询列表
	public List<User> findUserList() throws Exception;

}
