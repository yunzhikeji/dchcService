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

	
	Integer findPermitCountByBelongPlace(Integer belongPlace);
	
	Integer findNonPermitCountByBelongPlace(Integer belongPlace);
	
	Integer findRtype0CountByBelongPlace(Integer belongPlace);
	
	Integer findRtype1CountByBelongPlace(Integer belongPlace);
	
	Integer findRtype2CountByBelongPlace(Integer belongPlace);
	
	Integer findRtype3CountByBelongPlace(Integer belongPlace);
	
	Integer findRtype4CountByBelongPlace(Integer belongPlace);
}