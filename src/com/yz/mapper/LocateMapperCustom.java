package com.yz.mapper;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.po.Relperson;

public interface LocateMapperCustom {

	//查询地点列表
	List<Locate> findLocateList();

	//根据查询条件，查询地点列表
	List<Locate> findLocateListByQueryMessage(LocateQuery locateQuery);
	
	List<Locate> findLocateListByQueryVO(LocateQuery locateQuery);
	
	Integer findLocateListByQueryMessageCount(LocateQuery locateQuery);

	//根据人员，查询地点列表
	List<Locate> findLocateListByRelperson(Relperson relperson);
	
	Integer findLethHouseCountByBelongPlace(Integer belongPlace);
	
	Integer findNonLethHouseCountByBelongPlace(Integer belongPlace);
	
	Integer findPlaceType0CountByBelongPlace(Integer belongPlace);

	Integer findPlaceType1CountByBelongPlace(Integer belongPlace);
	
	Integer findPlaceType2CountByBelongPlace(Integer belongPlace);
	
	Integer findPlaceType3CountByBelongPlace(Integer belongPlace);
	
	Integer findPlaceType4CountByBelongPlace(Integer belongPlace);
	
	Integer findPlaceType5CountByBelongPlace(Integer belongPlace);

}