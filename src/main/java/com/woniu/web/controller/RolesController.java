package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.service.PermissionsService;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private RolesService service;
	@Autowired
	private PermissionsService permissionsService;

	@RequiresPermissions("roles:save")
	@RequestMapping("save")
	public String save(Roles roles) {
		System.out.println(roles);
		service.save(roles);
		return "redirect:/roles/findAll";
	}

	@RequiresPermissions("roles:delete")
	@RequestMapping("delete/{rolesId}")
	public String delete(@PathVariable Integer rolesId) {
		service.delete(rolesId);
		return "redirect:/roles/findAll";
	}

	@RequiresPermissions("roles:update")
	@RequestMapping("update")
	public String update(Roles roles) {
		service.update(roles);
		return "redirect:/roles/findAll";
	}

	@RequiresPermissions("roles:update")
	@RequestMapping("updateUI/{rolesId}")
	public String findByPrimaryKey(@PathVariable Integer rolesId, Model model) {
		Roles roles = service.find(rolesId);
		model.addAttribute("roles", roles);
		return "admin/roles/updateUI";
	}

	@RequiresPermissions("roles:find")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Roles> roles = service.find();
		model.addAttribute("list", roles);
		return "admin/roles/findUI";
	}

	// 分配权限第一步获取权限
	@RequiresPermissions("roles:grantpermissions")
	@RequestMapping("grantpermissionsUI/{rolesId}")
	public String grantpermissions(@PathVariable Integer rolesId, Model model) throws JsonProcessingException {
		// 获取要改权限的角色信息
		Roles roles = service.find(rolesId);
		model.addAttribute("roles", roles);
		// 获取所有权限，将permissions 打成 json 格式
		List<Permissions> permissions = permissionsService.find();
		ObjectMapper object = new ObjectMapper();
		String permissionsList = object.writeValueAsString(permissions);
		model.addAttribute("list", permissionsList);
		// 获取当前角色权限
		List<Permissions> permissionsByRolesId = service.selectPermissionsByRolesId(rolesId);
		String permissionsByRolesIdJson = object.writeValueAsString(permissionsByRolesId);
		model.addAttribute("permissionsByRolesIdJson", permissionsByRolesIdJson);
		return "admin/roles/grantpermissionsUI";
	}

	// 分配权限
	@RequestMapping("grantPermissions")
	public String grantPermissions(Integer rolesId, Integer[] permissionsId, Model model) {
		// 分配权限前先清除所有权限
		service.revokePermissionsFormRolesById(rolesId);
		// 分配权限
		service.grantPermissionsToRole(rolesId, permissionsId);
		String path = "redircet:/roles/grantpermissionsUI/" + rolesId;
		return path;
	}

}
