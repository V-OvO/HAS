package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Departments;
import com.woniu.service.DepartmentsService;

@Controller
@RequestMapping("departments")
public class DepartmentsController {
	
	@Autowired
	private DepartmentsService service;  
	
	@RequestMapping("save")
	public String save(Departments d) {
		service.save(d);
		return "admin/index";
	}
	
}
