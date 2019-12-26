package com.woniu.dao;

import com.woniu.domain.Appointments;
import com.woniu.domain.AppointmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentsMapper {
    long countByExample(AppointmentsExample example);

    int deleteByExample(AppointmentsExample example);

    int deleteByPrimaryKey(Integer appointmentsId);

    int insert(Appointments record);

    int insertSelective(Appointments record);

    List<Appointments> selectByExample(AppointmentsExample example);

    Appointments selectByPrimaryKey(Integer appointmentsId);

    int updateByExampleSelective(@Param("record") Appointments record, @Param("example") AppointmentsExample example);

    int updateByExample(@Param("record") Appointments record, @Param("example") AppointmentsExample example);

    int updateByPrimaryKeySelective(Appointments record);

    int updateByPrimaryKey(Appointments record);
}