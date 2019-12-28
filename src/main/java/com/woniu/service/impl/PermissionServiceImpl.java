package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PermissionsMapper;
import com.woniu.domain.Permissions;
import com.woniu.service.PermissionsService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionsService {
	@Autowired
	private PermissionsMapper permissionsMapper;

	@Override
	public void save(Permissions permission) {
		permissionsMapper.insert(permission);
	}

	@Override
	public void delete(Integer permissionsId) {
		permissionsMapper.deleteByPrimaryKey(permissionsId);
	}

	@Override
	public void update(Permissions permissions) {
		permissionsMapper.updateByPrimaryKey(permissions);

	}

	@Override
	public Permissions find(Integer permissionsId) {
		Permissions permissions = permissionsMapper.selectByPrimaryKey(permissionsId);
		return permissions;
	}

	@Override
	public List<Permissions> find() {
		List<Permissions> permissions = permissionsMapper.selectByExample(null);
		return permissions;
	}

}
