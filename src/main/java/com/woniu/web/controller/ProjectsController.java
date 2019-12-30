package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/projects/find";
	}
	
	@RequestMapping("delete/{projectsId}")
	public String delete(@PathVariable Integer projectsId) {
		service.delete(projectsId);
		return "redirect:/projects/find";
	}
	
	@RequestMapping("updateUI/{projectsId}")
	public String updateUI(@PathVariable Integer projectsId, Model model) {
		Projects p = service.find(projectsId);
		model.addAttribute("p", p);
		return "admin/permissions/updateUI";
	}
	
	@RequestMapping("update")
	public String update(Projects p) {
		service.update(p);
		return "redirect:/projects/find";
	}
	
	@RequestMapping("find")
	public String find(Model model) {
		List<Projects> list = service.find();
		model.addAttribute("list", list);
		return "admin/projects/findUI";
	}
	
}
