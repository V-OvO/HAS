package com.woniu.dao;

import com.woniu.domain.Schedulings;
import com.woniu.domain.SchedulingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulingsMapper {
    long countByExample(SchedulingsExample example);

    int deleteByExample(SchedulingsExample example);

    int deleteByPrimaryKey(Integer schedulingsId);

    int insert(Schedulings record);

    int insertSelective(Schedulings record);

    List<Schedulings> selectByExample(SchedulingsExample example);

    Schedulings selectByPrimaryKey(Integer schedulingsId);

    int updateByExampleSelective(@Param("record") Schedulings record, @Param("example") SchedulingsExample example);

    int updateByExample(@Param("record") Schedulings record, @Param("example") SchedulingsExample example);

    int updateByPrimaryKeySelective(Schedulings record);

    int updateByPrimaryKey(Schedulings record);
}