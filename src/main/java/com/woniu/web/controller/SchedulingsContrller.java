package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Schedulings;
import com.woniu.service.SchedulingsService;

@Controller
@RequestMapping("schedulings")
public class SchedulingsContrller {
	
	@Autowired
	private SchedulingsService ss;
	
	@RequiresPermissions("schedulings:save")
	@RequestMapping("save")
	public String save(Schedulings s) {
		System.out.println(s);
		ss.save(s);
		return "redirect:/schedulings/find";
	}
	
	@RequiresPermissions("schedulings:find")
	@RequestMapping("find")
	public String find(Model m) {
		List<Schedulings> list = ss.find();
		System.out.println(list);
		m.addAttribute("list",list);
		return "admin/schedulings/findUI";
	}
	
	@RequiresPermissions("schedulings:updateUI")
	@RequestMapping("updateUI/{schedulingsId}")
	public String updateUI(@PathVariable Integer schedulingsId,Model m) {
		Schedulings s = ss.find(schedulingsId);
		m.addAttribute("s",s);
		return "admin/schedulings/updateUI";
	}
	
	@RequiresPermissions("schedulings:update")
	@RequestMapping("update")
	public String update(Schedulings s) {
		ss.update(s);
		return "redirect:/schedulings/find";
	}
	
	@RequiresPermissions("schedulings:delete")
	@RequestMapping("delete/{schedulingsId}")
	public String delete(@PathVariable Integer schedulingsId) {
		ss.delete(schedulingsId);
		return "redirect:/schedulings/find";
	}
}
