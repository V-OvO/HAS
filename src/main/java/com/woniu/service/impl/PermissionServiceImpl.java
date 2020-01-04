package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PermissionsMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.PermissionsExample;
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
		PermissionsExample per = new PermissionsExample();
		per.or().andPermissionsIdNotEqualTo(-1);	
		System.out.println(permissionsMapper + "!!!!!!!!!!!!!");
		List<Permissions> permissions = permissionsMapper.selectByExample(per);
		return permissions;
	}

	// 用递归的方式获取权限，并以ztree的方式返回
	@Override
	public List<Permissions> getAllPermissionsByRecursion() {
		// 获得所有权限
		List<Permissions> allPremissions = find();
		// 存放最终结果集合
		List<Permissions> treePermissionsList = new ArrayList<>();
		// 找到所有根节点
		for (Permissions per : allPremissions) {
			if (per.getParentid() == 0) {
				treePermissionsList.add(per);
			}
		}
		// 给所有的根节点添加子节点
		for (Permissions per : allPremissions) {
			per.setChildren(getChild(per.getPermissionsId(), allPremissions));
		}
		return treePermissionsList;
	}

	// 找子节点
	private List<Permissions> getChild(Integer permissionsId, List<Permissions> allPermissions) {
		List<Permissions> childer = new ArrayList<>();
		// 遍历
		for (Permissions per : allPermissions) {
			// 如果parentId==permissionsId说明是子节点
			if (per.getParentid() != 0 && per.getParentid() == permissionsId) {
				childer.add(per);
			}
		}
		// 递归，给子节点加子节点
		if (childer.size() != 0) {
			for (Permissions per : childer) {
				per.setChildren(getChild(per.getPermissionsId(), allPermissions));
			}
		}
		return childer;
	}

	// 为权限集合中的每一个权限，按层级添加前缀
	@Override
	public void addPrefixToTreePermissionsList(List<Permissions> treePermissionsList) {
		for (Permissions per : treePermissionsList) {
			addPrefixToChildren(per.getChildren(), "　　");
		}
	}

	private void addPrefixToChildren(List<Permissions> childer, String prefix) {
		for (Permissions per : childer) {
			per.setPermissionName(prefix + per.getPermissionName());
			addPrefixToChildren(per.getChildren(), prefix + "　　");
		}
	}

	// 把权限树，转换为平级的集合
	@Override
	public List<Permissions> transferTreePermissionsListToFlatPermissionsList(List<Permissions> treePermissionsList) {
		List<Permissions> flatPermissionsList = new ArrayList<>();
		for (Permissions per : treePermissionsList) {
			flatPermissionsList.add(per);
			addChilder(per.getChildren(), flatPermissionsList);
		}
		return flatPermissionsList;
	}

	private void addChilder(List<Permissions> childer, List<Permissions> flatPermissionsList) {
		for (Permissions per : childer) {
			flatPermissionsList.add(per);
			addChilder(per.getChildren(), flatPermissionsList);
		}
	}

}
