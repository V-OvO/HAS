package com.woniu.dao;

import com.woniu.domain.Diagnoserooms;
import com.woniu.domain.DiagnoseroomsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnoseroomsMapper {
    long countByExample(DiagnoseroomsExample example);

    int deleteByExample(DiagnoseroomsExample example);

    int deleteByPrimaryKey(Integer diagnoseroomsId);

    int insert(Diagnoserooms record);

    int insertSelective(Diagnoserooms record);

    List<Diagnoserooms> selectByExample(DiagnoseroomsExample example);

    Diagnoserooms selectByPrimaryKey(Integer diagnoseroomsId);

    int updateByExampleSelective(@Param("record") Diagnoserooms record, @Param("example") DiagnoseroomsExample example);

    int updateByExample(@Param("record") Diagnoserooms record, @Param("example") DiagnoseroomsExample example);

    int updateByPrimaryKeySelective(Diagnoserooms record);

    int updateByPrimaryKey(Diagnoserooms record);
}