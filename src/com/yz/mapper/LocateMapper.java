package com.yz.mapper;

import com.yz.po.Locate;
import com.yz.po.LocateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocateMapper {
    int countByExample(LocateExample example);

    int deleteByExample(LocateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Locate record);

    int insertSelective(Locate record);

    List<Locate> selectByExampleWithBLOBs(LocateExample example);

    List<Locate> selectByExample(LocateExample example);

    Locate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Locate record, @Param("example") LocateExample example);

    int updateByExampleWithBLOBs(@Param("record") Locate record, @Param("example") LocateExample example);

    int updateByExample(@Param("record") Locate record, @Param("example") LocateExample example);

    int updateByPrimaryKeySelective(Locate record);

    int updateByPrimaryKeyWithBLOBs(Locate record);

    int updateByPrimaryKey(Locate record);
}