package com.woniu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.domain.UsersExample;

public interface UsersMapper {
	long countByExample(UsersExample example);

	int deleteByExample(UsersExample example);

	int deleteByPrimaryKey(Integer usersId);

	int insert(Users record);

	int insertSelective(Users record);

	List<Users> selectByExample(UsersExample example);

	Users selectByPrimaryKey(Integer usersId);

	int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

	int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

	int updateByPrimaryKeySelective(Users record);

	int updateByPrimaryKey(Users record);

	// 根据用户查角色
	List<Roles> seleteRolesByUsersId(Integer usersId);

	// 添加角色
	void insertrp(Map<String, Integer> map);

	// 删除角色
	void revokeRolesFromUsersId(Integer UsersId);
}