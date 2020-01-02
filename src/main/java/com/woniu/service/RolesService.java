package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;

public interface RolesService {
	void save(Roles r);

	void delete(Integer roles_id);

	void update(Roles r);

	Roles find(Integer roles_id);

	List<Roles> find();

	// 根据角色ID查权限
	List<Permissions> selectPermissionsByRolesId(Integer rolesId);

	// 给角色添加权限
	void grantPermissionsToRole(Integer RolesId, Integer[] permissionsId);

	// 避免重复添加，添加权限前删除该角色所有权限
	void revokePermissionsFormRolesById(Integer rolesId);

}
