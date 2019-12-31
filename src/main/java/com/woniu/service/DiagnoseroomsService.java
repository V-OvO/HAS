package com.woniu.service;

import java.util.List;

import com.woniu.domain.Diagnoserooms;

public interface DiagnoseroomsService {
	void save(Diagnoserooms obj);
	void delete(Integer id);
	void update(Diagnoserooms obj);
	Diagnoserooms find(Integer id);
	List<Diagnoserooms> find();
}
