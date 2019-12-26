package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {
	
	@Autowired
	private RolesService service; 
	
	@RequestMapping("save")
	public String save() {
		System.out.println("RolesController.save():"+service);
		return "admin/index";
	}
	
}
