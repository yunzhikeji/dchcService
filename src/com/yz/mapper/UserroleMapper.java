package com.yz.mapper;

import com.yz.po.Userrole;
import com.yz.po.UserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    int countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    Userrole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);

}