package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;

public interface PermissionsService {
	void save(Permissions permission);

	void delete(Integer permissionId);

	void update(Permissions permission);

	Permissions find(Integer permissionId);

	List<Permissions> find();
}
