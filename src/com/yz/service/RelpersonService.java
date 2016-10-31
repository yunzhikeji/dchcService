package com.yz.service;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.Relperson;
import com.yz.vo.CountVO;

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

	//根据人员查询相关人员列表
	public List<Relperson> findRelpersonListByRelpersonQuery(Relperson relperson);

	//根据场所地址查询相关人员列表
	public List<Relperson> findRelpersonListByAddress(String address);

	//根据传入的列表，处理统计数据 (countType  2:是否办理居住证  5:人员类别 10:所属派出所类别)
	public List<CountVO> handleCountByCountType(Integer countType);

}
