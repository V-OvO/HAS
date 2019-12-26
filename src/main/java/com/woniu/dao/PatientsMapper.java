package com.woniu.dao;

import com.woniu.domain.Patients;
import com.woniu.domain.PatientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientsMapper {
    long countByExample(PatientsExample example);

    int deleteByExample(PatientsExample example);

    int deleteByPrimaryKey(Integer patientsId);

    int insert(Patients record);

    int insertSelective(Patients record);

    List<Patients> selectByExample(PatientsExample example);

    Patients selectByPrimaryKey(Integer patientsId);

    int updateByExampleSelective(@Param("record") Patients record, @Param("example") PatientsExample example);

    int updateByExample(@Param("record") Patients record, @Param("example") PatientsExample example);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);
}