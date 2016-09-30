package com.yz.service;

import java.util.List;

import com.yz.po.Locate;

public interface LocateService {

	//新增地点场所
	public void insert(Locate locate);

	//获得场所列表
	public List<Locate> findLocateList();

	//根据id删除场所
	public void deleteLocateById(Integer id);

	//根据id修改场所
	public void updateLocateById(Integer id,Locate locate);

	//根据id查找场所
	public Locate findLocateById(Integer id);

	//查询条件
	public List<Locate> findLocateListByQueryMessage(String queryMessage);

}
