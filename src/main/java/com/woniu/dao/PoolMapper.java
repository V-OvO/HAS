package com.woniu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniu.domain.Pool;
import com.woniu.domain.PoolExample;

public interface PoolMapper {
    long countByExample(PoolExample example);

    int deleteByExample(PoolExample example);

    int deleteByPrimaryKey(Integer poolId);

    int insert(Pool record);

    int insertSelective(Pool record);

    List<Pool> selectByExample(PoolExample example);

    Pool selectByPrimaryKey(Integer poolId);

    int updateByExampleSelective(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByExample(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByPrimaryKeySelective(Pool record);

    int updateByPrimaryKey(Pool record);
    
    List<Pool> selectAll();
}