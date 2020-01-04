package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import com.woniu.service.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesMapper mapper;

	@Override
	public void save(Roles r) {
		mapper.insert(r);
	}

	@Override
	public void delete(Integer roles_id) {
		mapper.deleteByPrimaryKey(roles_id);
	}

	@Override
	public void update(Roles r) {
		mapper.updateByPrimaryKey(r);
	}

	@Override
	public Roles find(Integer roles_id) {
		Roles roles = mapper.selectByPrimaryKey(roles_id);
		return roles;
	}

	@Override
	public List<Roles> find() {
		RolesExample rol = new RolesExample();
		rol.or().andRolesIdEqualTo(-1);
		List<Roles> roles = mapper.selectByExample(null);
		return roles;
	}

	// 根据角色ID查权限
	@Override
	public List<Permissions> selectPermissionsByRolesId(Integer rolesId) {
		List<Permissions> permissions = mapper.selectPermissionsByRolesId(rolesId);
		return permissions;
	}

	// 给角色添加权限
	@Override
	public void grantPermissionsToRole(Integer RolesId, Integer[] permissionsId) {
		Map<String, Integer> map = new HashMap<>();
		map.put("rolesId", RolesId);
		for (Integer pid : permissionsId) {
			map.put("permissionsId", pid);
			mapper.insertip(map);
		}
	}

	// 避免重复添加，添加权限前删除该角色所有权限
	@Override
	public void revokePermissionsFormRolesById(Integer rolesId) {
		mapper.revokePermissionsFormRoleById(rolesId);
	}

}
