package com.woniu.service;

import java.util.List;

import com.woniu.domain.Departments;

public interface DepartmentsService {
	void save(DepartmentsService r);
	void delete(Integer departments_id);
	void update(DepartmentsService r);
	Departments find(Integer departments_id);
	List<Departments> find();
	
}
