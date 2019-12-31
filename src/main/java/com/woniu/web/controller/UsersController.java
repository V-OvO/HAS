package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Users;
import com.woniu.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	private UsersService service;

	@RequestMapping("save")
	public String save(Users users) {
		service.save(users);
		return "admin/index";
	}

	@RequestMapping("delete")
	public String delete(Integer usersId) {
		service.delete(usersId);
		return "admin/index";
	}

	@RequestMapping("update")
	public String update(Users users) {
		service.update(users);
		return "admin/index";
	}

	@RequestMapping("findByPrimaryKey")
	public String findByPrimaryKey(Integer usersId) {
		Users users = service.find(usersId);
		return "admin/index";
	}

	@RequestMapping("findAll")
	public String findAll() {
		List<Users> users = service.find();
		return "admin/index";
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
}
