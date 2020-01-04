package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Diagnoserooms;
import com.woniu.service.DiagnoseroomsService;

@Controller
@RequestMapping("diagnoserooms")
public class DiagnoseroomsController {
	@Autowired
	private DiagnoseroomsService service;
	@RequestMapping("save")
	public String save(Diagnoserooms obj) {
		service.save(obj);
		return "redirect:/diagnoserooms/find";
	}
	@RequestMapping("find")
	public String find(Model model) {
		
		List<Diagnoserooms> list = service.find();
		model.addAttribute("list", list);
		return "admin/diagnoserooms/findUI";
	}
	@RequestMapping("delete/{diagnoseroomsId}")
	public String delete(@PathVariable Integer DiagnoseroomsId) {
		service.delete(DiagnoseroomsId);
		return "redirect:/diagnoserooms/find";
	}
	@RequestMapping("updateUI/{diagnoseroomsId}")
	public String updateUI(@PathVariable Integer DiagnoseroomsId,Model model) {
		Diagnoserooms d = service.find(DiagnoseroomsId);
		model.addAttribute("d", d);
		return "admin/diagnoserooms/updateUI";
	}
	@RequestMapping("update")
	public String update(Diagnoserooms obj) {
		service.update(obj);
		return "redirect:/diagnoserooms/find";
	}
	
}
