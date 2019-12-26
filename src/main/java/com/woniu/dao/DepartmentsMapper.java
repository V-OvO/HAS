package com.woniu.dao;

import com.woniu.domain.Departments;
import com.woniu.domain.DepartmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentsMapper {
    long countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);

    int deleteByPrimaryKey(Integer departmentsId);

    int insert(Departments record);

    int insertSelective(Departments record);

    List<Departments> selectByExampleWithBLOBs(DepartmentsExample example);

    List<Departments> selectByExample(DepartmentsExample example);

    Departments selectByPrimaryKey(Integer departmentsId);

    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExampleWithBLOBs(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKeyWithBLOBs(Departments record);

    int updateByPrimaryKey(Departments record);
}