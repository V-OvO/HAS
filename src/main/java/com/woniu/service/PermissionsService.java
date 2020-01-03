package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;

public interface PermissionsService {
	void save(Permissions permission);

	void delete(Integer permissionId);

	void update(Permissions permission);

	Permissions find(Integer permissionId);

	List<Permissions> find();

	// 用递归的方式获取权限，并以ztree的方式返回
	List<Permissions> getAllPermissionsByRecursion();

	// 为权限集合中的每一个权限，按层级添加前缀
	void addPrefixToTreePermissionsList(List<Permissions> treePermissionsList);

	// 把权限树，转换为平级的集合
	List<Permissions> transferTreePermissionsListToFlatPermissionsList(List<Permissions> treePermissionsList);
}
