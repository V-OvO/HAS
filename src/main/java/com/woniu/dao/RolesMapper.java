package com.woniu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;

public interface RolesMapper {
	long countByExample(RolesExample example);

	int deleteByExample(RolesExample example);

	int deleteByPrimaryKey(Integer rolesId);

	int insert(Roles record);

	int insertSelective(Roles record);

	List<Roles> selectByExample(RolesExample example);

	Roles selectByPrimaryKey(Integer rolesId);

	int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

	int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

	int updateByPrimaryKeySelective(Roles record);

	int updateByPrimaryKey(Roles record);

	List<Permissions> selectPermissionsByRolesId(Integer rolesId);

	void insertip(Map<String, Integer> map);

	void revokePermissionsFormRoleById(Integer RolesId);
}