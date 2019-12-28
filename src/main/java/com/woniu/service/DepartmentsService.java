package com.woniu.service;

import java.util.List;

import com.woniu.domain.Departments;

public interface DepartmentsService {
	void save(Departments d);
	void delete(Integer departments_id);
	void update(Departments d);
	Departments find(Integer departments_id);
	List<Departments> find();
	
}
