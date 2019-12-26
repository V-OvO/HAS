package com.woniu.dao;

import com.woniu.domain.Doctors;
import com.woniu.domain.DoctorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorsMapper {
    long countByExample(DoctorsExample example);

    int deleteByExample(DoctorsExample example);

    int deleteByPrimaryKey(Integer doctorsId);

    int insert(Doctors record);

    int insertSelective(Doctors record);

    List<Doctors> selectByExampleWithBLOBs(DoctorsExample example);

    List<Doctors> selectByExample(DoctorsExample example);

    Doctors selectByPrimaryKey(Integer doctorsId);

    int updateByExampleSelective(@Param("record") Doctors record, @Param("example") DoctorsExample example);

    int updateByExampleWithBLOBs(@Param("record") Doctors record, @Param("example") DoctorsExample example);

    int updateByExample(@Param("record") Doctors record, @Param("example") DoctorsExample example);

    int updateByPrimaryKeySelective(Doctors record);

    int updateByPrimaryKeyWithBLOBs(Doctors record);

    int updateByPrimaryKey(Doctors record);
}