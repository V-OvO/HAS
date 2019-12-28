package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesMapper;
import com.woniu.domain.Roles;
import com.woniu.service.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesMapper mapper;

	@Override
	public void save(Roles r) {
		mapper.insert(r);
	}

	@Override
	public void delete(Integer roles_id) {
		mapper.deleteByPrimaryKey(roles_id);
	}

	@Override
	public void update(Roles r) {
		mapper.updateByPrimaryKey(r);
	}

	@Override
	public Roles find(Integer roles_id) {
		Roles roles = mapper.selectByPrimaryKey(roles_id);
		return roles;
	}

	@Override
	public List<Roles> find() {
		List<Roles> roles = mapper.selectByExample(null);
		return roles;
	}

}
