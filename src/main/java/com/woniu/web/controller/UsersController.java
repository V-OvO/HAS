package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.service.RolesService;
import com.woniu.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	private UsersService service;
	@Autowired
	private RolesService rolesService;

	@RequiresPermissions("users:save")
	@RequestMapping("save")
	public String save(Users users) {
		service.save(users);
		return "redirect:/users/findAll";
	}

	@RequiresPermissions("users:delete")
	@RequestMapping("delete/{usersId}")
	public String delete(@PathVariable Integer usersId) {
		service.delete(usersId);
		return "redirect:/users/findAll";
	}

	@RequiresPermissions("users:update")
	@RequestMapping("update")
	public String update(Users users) {
		service.update(users);
		return "redirect:/users/findAll";
	}

	@RequiresPermissions("users:update")
	@RequestMapping("updateUI/{usersId}")
	public String findByPrimaryKey(@PathVariable Integer usersId, Model model) {
		Users users = service.find(usersId);
		model.addAttribute("users", users);
		return "admin/users/updateUI";
	}

	@RequiresPermissions("users:find")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Users> users = service.find();
		model.addAttribute("list", users);
		return "admin/users/findUI";
	}

	@RequestMapping("login")
	public String login(String usersNumber, String usersPassword) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(usersNumber, usersPassword);
		String path = "";
		try {
			subject.login(token);
			path = "admin/home";
		} catch (Exception e) {
			path = "admin/login";
		}
		return "redirect:/" + path + ".jsp";
	}

	// 分配角色第一步查角色
	@RequestMapping("grantRolesUI/{usersId}")
	public String grantRoles(@PathVariable Integer usersId, Model model) {
		// 获取要分配角色的用户
		Users users = service.find(usersId);
		model.addAttribute("users", users);
		// 获取所有角色
		List<Roles> roles = rolesService.find();
		model.addAttribute("roles", roles);
		// 获取当前用户角色
		List<Roles> rolesByUsersId = service.seleteRolesByUsersId(usersId);
		model.addAttribute("rolesList", rolesByUsersId);
		return "admin/roles/grantRolesUI";
	}

	// 给指定用户分配角色
	@RequestMapping("grantRoles")
	public String grantRoles(Integer usersId, Integer[] rolesId, Model model) {
		// 为用户分配角色前先删除所有角色
		service.revokeRolesFromUserByUsersId(usersId);
		// 给指定用户分配角色
		service.grantRolesToUser(usersId, rolesId);

		String path = "redirect:/user/grantrolesUI/" + usersId;
		return path;
	}

}
