package com.woniu.service;

import java.util.List;

import com.woniu.domain.Departments;

public interface DepartmentsService {
	void save(Departments d);
	void delete(Integer departmentsId);
	void update(Departments d);
	Departments find(Integer departmentsId);
	List<Departments> find();
	
}
