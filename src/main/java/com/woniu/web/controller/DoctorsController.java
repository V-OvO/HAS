package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Doctors;
import com.woniu.service.DoctorService;

@Controller
@RequestMapping("doctors")
public class DoctorsController {
	@Autowired
	private DoctorService service;

	@RequiresPermissions("doctors:save")
	@RequestMapping("save")
	public String save(Doctors doctors) {
		service.save(doctors);
		return "redirect:/doctors/findAll";
	}

	@RequiresPermissions("doctors:delete")
	@RequestMapping("delete/{doctorsId}")
	public String delete(@PathVariable Integer doctorsId) {
		service.delete(doctorsId);
		return "redirect:/doctors/findAll";
	}

	@RequiresPermissions("doctors:update")
	@RequestMapping("update")
	public String update(Doctors doctors) {
		service.update(doctors);
		return "redirect:/doctors/findAll";
	}

	@RequiresPermissions("doctors:update")
	@RequestMapping("updateUI/{doctorsId}")
	public String findByPrimaryKey(@PathVariable Integer doctorsId, Model model) {
		Doctors doctors = service.find(doctorsId);
		model.addAttribute("doctors", doctors);
		return "admin/doctors/updateUI";
	}

	@RequiresPermissions("doctors:findAll")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Doctors> doctors = service.find();
		model.addAttribute("list", doctors);
		return "admin/doctors/findUI";
	}
}
