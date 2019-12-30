package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DepartmentsMapper;
import com.woniu.domain.Departments;
import com.woniu.service.DepartmentsService;

@Service
@Transactional
public class DepartmentsServiceImpl implements DepartmentsService {
	
	@Autowired
	private DepartmentsMapper mapper;

	@Override
	public void save(Departments d) {
		System.out.println("DepartmentsServiceImpl.save()");
		// TODO Auto-generated method stub
		mapper.insert(d);
	}

	@Override
	public void delete(Integer departmentsId) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(departmentsId);
	}

	@Override
	public void update(Departments d) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(d);
	}

	@Override
	public Departments find(Integer departmentsId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(departmentsId);
	}

	@Override
	public List<Departments> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExampleWithBLOBs(null);
	}

}
