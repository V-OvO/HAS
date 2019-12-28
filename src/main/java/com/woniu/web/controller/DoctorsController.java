package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Doctors;
import com.woniu.service.DoctorService;

@Controller
@RequestMapping("doctors")
public class DoctorsController {
	@Autowired
	private DoctorService service;

	@RequestMapping("save")
	public String save(Doctors doctors) {
		service.save(doctors);
		return "admin/index";
	}

	@RequestMapping("delete")
	public String delete(Integer doctorsId) {
		service.delete(doctorsId);
		return "admin/index";
	}

	@RequestMapping("update")
	public String update(Doctors doctors) {
		service.update(doctors);
		return "admin/index";
	}

	@RequestMapping("findByPrimaryKey")
	public String findByPrimaryKey(Integer doctorsId) {
		Doctors doctors = service.find(doctorsId);
		return "admin/index";
	}

	@RequestMapping("findAll")
	public String findAll() {
		List<Doctors> doctors = service.find();
		return "admin/index";
	}
}
