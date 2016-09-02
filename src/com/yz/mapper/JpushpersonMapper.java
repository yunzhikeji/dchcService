package com.yz.mapper;

import com.yz.po.Jpushperson;
import com.yz.po.JpushpersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JpushpersonMapper {
    int countByExample(JpushpersonExample example);

    int deleteByExample(JpushpersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jpushperson record);

    int insertSelective(Jpushperson record);

    List<Jpushperson> selectByExample(JpushpersonExample example);

    Jpushperson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jpushperson record, @Param("example") JpushpersonExample example);

    int updateByExample(@Param("record") Jpushperson record, @Param("example") JpushpersonExample example);

    int updateByPrimaryKeySelective(Jpushperson record);

    int updateByPrimaryKey(Jpushperson record);
}