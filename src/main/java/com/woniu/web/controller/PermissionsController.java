package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Permissions;
import com.woniu.service.PermissionsService;

@Controller
@RequestMapping("permissions")
public class PermissionsController {
	@Autowired
	private PermissionsService service;

	@RequestMapping("save")
	public String save(Permissions permissions) {
		service.save(permissions);
		return "admin/index";
	}

	@RequestMapping("delete")
	public String delete(Integer permissionsId) {
		service.delete(permissionsId);
		return "admin/index";
	}

	@RequestMapping("update")
	public String update(Permissions permissions) {
		service.update(permissions);
		return "admin/index";
	}

	@RequestMapping("findByPrimaryKey")
	public String findByPrimaryKey(Integer permissionsId) {
		Permissions permissions = service.find(permissionsId);
		return "admin/index";
	}

	@RequestMapping("findAll")
	public String findAll() {
		List<Permissions> permissions = service.find();
		return "redirct:/admin/index";
	}

}
