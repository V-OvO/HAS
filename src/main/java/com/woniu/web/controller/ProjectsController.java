package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Projects;
import com.woniu.service.ProjectsService;

@Controller
@RequestMapping("projects")
public class ProjectsController {
	
	@Autowired
	private ProjectsService service;  
	
	@RequestMapping("save")
	public String save(Projects p) {
		service.save(p);
		return "admin/index";
	}
	
}
