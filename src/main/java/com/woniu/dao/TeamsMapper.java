package com.woniu.dao;

import com.woniu.domain.Teams;
import com.woniu.domain.TeamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamsMapper {
    long countByExample(TeamsExample example);

    int deleteByExample(TeamsExample example);

    int deleteByPrimaryKey(Integer teamsId);

    int insert(Teams record);

    int insertSelective(Teams record);

    List<Teams> selectByExample(TeamsExample example);

    Teams selectByPrimaryKey(Integer teamsId);

    int updateByExampleSelective(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByExample(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
}