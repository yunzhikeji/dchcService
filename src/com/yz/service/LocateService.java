package com.yz.service;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.LocateQuery;

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
	public List<Locate> findLocateListByQueryMessage(LocateQuery locateQuery);

	//根据传入的地址查询场所,传入addressType(1:表示现住地址 2:表示工作单位地址)
	public Locate getRealLocate(Integer addressType,String addressMsg);

}
