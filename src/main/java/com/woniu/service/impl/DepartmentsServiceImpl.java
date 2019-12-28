package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.DepartmentsMapper;
import com.woniu.domain.Departments;
import com.woniu.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	
	@Autowired
	private DepartmentsMapper mapper;

	@Override
	public void save(Departments d) {
		// TODO Auto-generated method stub
		mapper.insertSelective(d);
	}

	@Override
	public void delete(Integer departments_id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(departments_id);
	}

	@Override
	public void update(Departments d) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(d);
	}

	@Override
	public Departments find(Integer departments_id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(departments_id);
	}

	@Override
	public List<Departments> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
