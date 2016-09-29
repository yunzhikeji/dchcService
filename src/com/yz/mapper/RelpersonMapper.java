package com.yz.mapper;

import com.yz.po.Relperson;
import com.yz.po.RelpersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelpersonMapper {
    int countByExample(RelpersonExample example);

    int deleteByExample(RelpersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Relperson record);

    int insertSelective(Relperson record);

    List<Relperson> selectByExampleWithBLOBs(RelpersonExample example);

    List<Relperson> selectByExample(RelpersonExample example);

    Relperson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Relperson record, @Param("example") RelpersonExample example);

    int updateByExampleWithBLOBs(@Param("record") Relperson record, @Param("example") RelpersonExample example);

    int updateByExample(@Param("record") Relperson record, @Param("example") RelpersonExample example);

    int updateByPrimaryKeySelective(Relperson record);

    int updateByPrimaryKeyWithBLOBs(Relperson record);

    int updateByPrimaryKey(Relperson record);
}