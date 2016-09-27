package com.yz.service;

import java.util.List;

import com.yz.po.Relperson;

public interface RelpersonService {

	//新增地点场所
	public void insert(Relperson relperson);

	//获得场所列表
	public List<Relperson> findRelpersonList();

	//根据id删除场所
	public void deleteRelpersonById(Integer id);

	//根据id修改场所
	public void updateRelpersonById(Integer id,Relperson relperson);

}
