package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.RolesMapper;
import com.woniu.domain.Roles;
import com.woniu.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService {
	
	@Autowired
	private RolesMapper mapper;

	@Override
	public void save(RolesService r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer roles_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(RolesService r) {
		// TODO Auto-generated method stub

	}

	@Override
	public Roles find(Integer roles_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roles> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
