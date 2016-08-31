package com.yz.mapper;

import com.yz.po.Clientversion;
import com.yz.po.ClientversionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientversionMapper {
    int countByExample(ClientversionExample example);

    int deleteByExample(ClientversionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clientversion record);

    int insertSelective(Clientversion record);

    List<Clientversion> selectByExample(ClientversionExample example);

    Clientversion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clientversion record, @Param("example") ClientversionExample example);

    int updateByExample(@Param("record") Clientversion record, @Param("example") ClientversionExample example);

    int updateByPrimaryKeySelective(Clientversion record);

    int updateByPrimaryKey(Clientversion record);
}