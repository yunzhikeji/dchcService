package com.yz.mapper;

import com.yz.po.Locate;

public interface LocateMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Locate record);

    int insertSelective(Locate record);

    Locate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Locate record);

    int updateByPrimaryKeyWithBLOBs(Locate record);

    int updateByPrimaryKey(Locate record);
}