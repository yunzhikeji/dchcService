package com.yz.mapper;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.LocateQuery;

public interface LocateMapperCustom {

	//查询地点列表
	List<Locate> findLocateList();

	//根据查询条件，查询地点列表
	List<Locate> findLocateListByQueryMessage(LocateQuery locateQuery);

}