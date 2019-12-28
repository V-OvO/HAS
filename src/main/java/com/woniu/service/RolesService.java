package com.woniu.service;

import java.util.List;

import com.woniu.domain.Roles;

public interface RolesService {
	void save(Roles r);
	void delete(Integer roles_id);
	void update(Roles r);
	Roles find(Integer roles_id);
	List<Roles> find();
}
