package com.yz.mapper;

import com.yz.po.Relperson;

public interface RelpersonMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Relperson record);

    int insertSelective(Relperson record);

    Relperson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Relperson record);

    int updateByPrimaryKeyWithBLOBs(Relperson record);

    int updateByPrimaryKey(Relperson record);
}