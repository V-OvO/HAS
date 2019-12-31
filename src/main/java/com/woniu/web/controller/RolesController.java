package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Roles;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private RolesService service;

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
	@RequestMapping("update/{rolesId}")
	public String findByPrimaryKey(@PathVariable Integer rolesId, Model model) {
		Roles roles = service.find(rolesId);
		return "admin/roles/updateUI";
	}

	@RequiresPermissions("roles:find")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Roles> roles = service.find();
		model.addAttribute("list", roles);
		return "admin/roles/findUI";
	}

}
