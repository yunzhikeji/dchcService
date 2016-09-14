package com.yz.mapper;

import java.util.List;

import com.yz.po.JpushPersonVo;
import com.yz.po.Jpushperson;

public interface JpushpersonMapperCustom {

	// 查询所有历史
	public List<Jpushperson> findJpushpersonList();
	
	
	//查询当前需要检测
	public List<Jpushperson> jpushpersonCheck();
	
	public int count(Integer userroleid);

	public List<Jpushperson> findJpushPersonByUserOnApp(JpushPersonVo jpushPersonVo);
	

}