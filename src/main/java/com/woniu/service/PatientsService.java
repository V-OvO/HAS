package com.woniu.service;

import java.util.List;

import com.woniu.domain.Patients;

public interface PatientsService {
	void save(Patients obj);
	void delete(Integer id);
	void update(Patients obj);
	Patients find(Integer id);
	List<Patients> find();
}
