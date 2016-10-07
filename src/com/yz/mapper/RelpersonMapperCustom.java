package com.yz.mapper;

import java.util.List;

import com.yz.po.Locate;
import com.yz.po.Relperson;

public interface RelpersonMapperCustom {

	List<Relperson> findRelpersonList();

	List<Relperson> findRelpersonListByRelpersonQuery(Relperson relperson);

	List<Relperson> findRelpersonListByAddress(String address);

}