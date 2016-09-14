package com.yz.service;

import java.util.List;

import com.yz.po.JpushPersonVo;
import com.yz.po.Jpushperson;

public interface JpushpersonService {

	// 添加一个人员
	public void insert(Jpushperson person) throws Exception;

	// 删除一个人员
	public void deleteJPushPersonById(Integer id) throws Exception;

	// 根据id查询用户
	public Jpushperson findJPushPersonById(Integer id) throws Exception;

	// 用户查询列表
	public List<Jpushperson> findJPushPersonList() throws Exception;

	// 修改人员信息
	public void updateJPushPerson(Integer id, Jpushperson person) throws Exception;
	
 	public List<Jpushperson> jpushpersonCheck() throws Exception;
 	
 	public int count(Integer userroleid) throws Exception;

	public List<Jpushperson> findJpushPersonByUserOnApp(JpushPersonVo jpushPersonVo);


}
