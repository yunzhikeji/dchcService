package com.yz.mapper;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.Relperson;
import com.yz.po.RelpersonQuery;
import com.yz.po.RelpersonVO;

public interface RelpersonMapperCustom {

	List<Relperson> findRelpersonList();

	List<RelpersonVO> findRelpersonListByRelpersonQuery(RelpersonVO relpersonVO);
	
	Integer findRelpersonListByRelpersonQueryCount(RelpersonVO relpersonVO);

	List<Relperson> findRelpersonListByAddress(String address);

	List<Relperson> findLocateListByQueryMessage(RelpersonQuery relpersonQuery);

}