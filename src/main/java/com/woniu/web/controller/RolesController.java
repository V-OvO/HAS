package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Roles;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private RolesService service;

	@RequestMapping("save")
	public String save(Roles roles) {
		service.save(roles);
		return "admin/index";
	}

	@RequestMapping("delete")
	public String delete(Integer roles_id) {
		service.delete(roles_id);
		return "admin/index";
	}

	@RequestMapping("update")
	public String update(Roles roles) {
		service.update(roles);
		return "admin/index";
	}

	@RequestMapping("findByPrimaryKey")
	public String findByPrimaryKey(Integer roles_id) {
		Roles roles = service.find(roles_id);
		return "admin/index";
	}

	@RequestMapping("findAll")
	public String findAll() {
		List<Roles> roles = service.find();
		return "admin/index";
	}

}
