package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Doctors;
import com.woniu.domain.Pool;
import com.woniu.domain.Schedulings;
import com.woniu.service.DoctorService;
import com.woniu.service.PoolService;
import com.woniu.service.SchedulingsService;

@Controller
@RequestMapping("pool")
public class PoolController {
	
	@Autowired
	private PoolService ps;
	@Autowired
	private SchedulingsService ss;
	@Autowired
	private DoctorService ds;
	
	@RequestMapping("saveUI")
	public String saveUI(Model m) {
		List<Schedulings> list = ss.find();
		List<Doctors> list1 = ds.find();
		m.addAttribute("list", list);
		m.addAttribute("list1",list1);
		return "admin/pool/saveUI";
	}
	@RequiresPermissions("pool:save")
	@RequestMapping("save")
	public String save(Pool p) {
		ps.save(p);;
		return "redirect:/pool/find";
	}
	@RequiresPermissions("pool:find")
	@RequestMapping("find")
	public String find(Model m) {
		List<Pool> list = ps.find();
		m.addAttribute("list",list);
		return "admin/pool/findUI";
	}
	
	@RequiresPermissions("pool:updateUI")
	@RequestMapping("updateUI/{poolId}")
	public String updateUI(@PathVariable Integer poolId,Model m) {
		Pool pool = ps.find(poolId);
		List<Schedulings> list = ss.find();
		List<Doctors> doctors = ds.find();
		m.addAttribute("ss",list);
		m.addAttribute("pool",pool);
		m.addAttribute("ds",doctors);
		return "admin/pool/updateUI";
	}
	
	@RequiresPermissions("pool:update")
	@RequestMapping("update")
	public String update(Pool p) {
		System.out.println("ooooo");
		System.out.println(p+"0000");
		 ps.update(p);
		return "redirect:/pool/find";
	}
	
	@RequiresPermissions("pool:delete")
	@RequestMapping("delete/{poolId}")
	public String delete(Integer poolId) {
		ps.delete(poolId);
		return "redirect:/pool/find";
	}
}
