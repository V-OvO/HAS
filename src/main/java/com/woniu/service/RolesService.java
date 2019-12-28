package com.woniu.service;

import java.util.List;

import com.woniu.domain.Roles;

public interface RolesService {
	void save(RolesService r);
	void delete(Integer roles_id);
	void update(RolesService r);
	Roles find(Integer roles_id);
	List<Roles> find();
	
}
