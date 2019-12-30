package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Departments;
import com.woniu.domain.Permissions;
import com.woniu.service.DepartmentsService;

@Controller
@RequestMapping("departments")
public class DepartmentsController {
	
	@Autowired
	private DepartmentsService service;
	
	@RequestMapping("save")
	public String save(Departments d) {
		service.save(d);
		return "redirect:/departments/find";
	}
	
	@RequestMapping("delete/{departmentsId}")
	public String delete(@PathVariable Integer departmentsId) {
		service.delete(departmentsId);
		return "redirect:/departments/find";
	}
	
	@RequestMapping("updateUI/{departmentsId}")
	public String updateUI(@PathVariable Integer departmentsId, Model model) {
		Departments d = service.find(departmentsId);
		model.addAttribute("d", d);
		return "admin/permissions/updateUI";
	}
	
	@RequestMapping("update")
	public String update(Departments d) {
		service.update(d);
		return "redirect:/departments/find";
	}
	
	@RequestMapping("find")
	public String find(Model model) {
		List<Departments> list = service.find();
		model.addAttribute("list", list);
		return "admin/departments/findUI";
	}
	
}
