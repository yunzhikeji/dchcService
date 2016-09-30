package com.yz.service;

import java.util.List;

import com.yz.po.Relperson;

public interface RelpersonService {

	//新增相关人员
	public void insert(Relperson relperson);

	//获得相关人员列表
	public List<Relperson> findRelpersonList();

	//根据id删除相关人员
	public void deleteRelpersonById(Integer id);

	//根据id修改相关人员
	public void updateRelpersonById(Integer id,Relperson relperson);
	
	//根据id查询相关人员
	public Relperson findRelpersonById(Integer id);

	public List<Relperson> findRelpersonListByRelpersonQuery(Relperson relperson);

}
