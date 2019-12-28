package com.woniu.service;

import java.util.List;

import com.woniu.domain.Doctors;

public interface DoctorService {

	void save(Doctors doctors);

	void delete(Integer doctorsId);

	void update(Doctors doctors);

	Doctors find(Integer doctorsId);

	List<Doctors> find();
}
