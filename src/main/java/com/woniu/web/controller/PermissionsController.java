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
import com.woniu.service.PermissionsService;

@Controller
@RequestMapping("permissions")
public class PermissionsController {
	@Autowired
	private PermissionsService service;

	@RequiresPermissions("permissions:save")
	@RequestMapping("saveUI")
	public String save(Model model) {
		// 得到所有权限
		List<Permissions> permissions = service.getAllPermissionsByRecursion();
		// 按层级加前缀
		service.addPrefixToTreePermissionsList(permissions);
		// 将树形结构装换为平级
		List<Permissions> permissionsList = service.transferTreePermissionsListToFlatPermissionsList(permissions);
		model.addAttribute("list", permissionsList);
		return "admin/permissions/saveUI";
	}

	@RequiresPermissions("permissions:save")
	@RequestMapping("save")
	public String save(Permissions permissions) {
		System.out.println(permissions);
		service.save(permissions);
		return "redirect:/permissions/findAll";
	}

	@RequiresPermissions("permissions:delete")
	@RequestMapping("delete/{permissionsId}")
	public String delete(@PathVariable Integer permissionsId) {
		service.delete(permissionsId);
		return "redirect:/permissions/findAll";
	}

	@RequiresPermissions("permissions:update")
	@RequestMapping("update")
	public String update(Permissions permissions) {
		service.update(permissions);
		return "redirect:/permissions/findAll";
	}

	@RequiresPermissions("permissions:update")
	@RequestMapping("updateUI/{permissionsId}")
	public String findByPrimaryKey(@PathVariable Integer permissionsId, Model model) {
		Permissions permissions = service.find(permissionsId);
		model.addAttribute("permissions", permissions);
		return "admin/permissions/updateUI";
	}

	@RequiresPermissions("permissions:find")
	@RequestMapping("findAll")
	public String findAll(Model model) throws JsonProcessingException {
		List<Permissions> permissions = service.find();
		ObjectMapper object = new ObjectMapper();
		// 将permissions转换为json格式
		String treeJson = object.writeValueAsString(permissions);
		System.out.println(treeJson);
		model.addAttribute("list", treeJson);
		
		System.out.println(permissions);
		
		return "admin/permissions/findUI";

	}

}
