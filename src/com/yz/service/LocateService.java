package com.yz.service;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.utils.Page;
import com.yz.vo.CountVO;
import com.yz.vo.LocateCount;

public interface LocateService{

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
	public Page findLocateListByQueryMessage(LocateQuery locateQuery);

	//根据传入的地址查询场所,传入addressType(1:表示现住地址 2:表示工作单位地址)
	public Locate getRealLocate(Integer addressType,String addressMsg);

	//根据传入的列表，处理统计数据 (countType  2:是否出租房  6:场所性质 10:所属派出所类别)
	public List<CountVO> handleCountByCountType(Integer countType);

	public List<LocateCount> findLocateCount();

}
