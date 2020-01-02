package com.woniu.service;

import java.util.List;

import com.woniu.domain.Roles;
import com.woniu.domain.Users;

public interface UsersService {

	void save(Users users);

	void delete(Integer usersId);

	void update(Users users);

	Users find(Integer usersId);

	List<Users> find();

	// 给用户添加角色
	void grantRolesToUser(Integer usersId, Integer[] rolesId);

	// 删除当前用户角色
	void revokeRolesFromUserByUsersId(Integer usersId);

	// 根据用户ID查询角色
	List<Roles> seleteRolesByUsersId(Integer usersId);
}
