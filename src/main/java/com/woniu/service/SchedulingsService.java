package com.woniu.service;

import java.util.List;

import com.woniu.domain.Schedulings;

public interface SchedulingsService {
	void save(Schedulings s);
	void delete(Integer schedulingsId);
	void update(Schedulings s);
	Schedulings find(Integer schedulingsId);
	List<Schedulings> find();
	
}
