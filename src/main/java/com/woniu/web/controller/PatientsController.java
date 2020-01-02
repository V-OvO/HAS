package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Patients;
import com.woniu.service.PatientsService;

@Controller
@RequestMapping("patients")
public class PatientsController {
	@Autowired
	private PatientsService service;
	@RequestMapping("save")
	public String save(Patients obj) {
		System.out.println("PatientsController.save()");
		System.out.println(obj);
		service.save(obj);
		return "redirect:/patients/find";
	}
	@RequestMapping("find")
	public String find(Model model) {
		System.out.println("PatientsController.find()");
		
		List<Patients> list = service.find();
		System.out.println(list);
		model.addAttribute("list", list);
		return "admin/patients/findUI";
	}
	@RequestMapping("delete/{patientsId}")
	public String delete(@PathVariable Integer patientsId) {
		service.delete(patientsId);
		return "redirect:/patients/find";
	}
	@RequestMapping("updateUI/{patientsId}")
	public String updateUI(@PathVariable Integer patientsId,Model model) {
		Patients p = service.find(patientsId);
		model.addAttribute("p", p);
		return "admin/patients/updateUI";
	}
	//修改
	@RequestMapping("update")
	public String update(Patients obj) {
		service.update(obj);
		return "redirect:/Patients/find";
	}
	
}
