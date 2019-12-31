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
<<<<<<< HEAD
		mapper.insert(r);
=======
		// TODO Auto-generated method stub
		
>>>>>>> gyx
	}

	@Override
	public void delete(Integer roles_id) {
<<<<<<< HEAD
		mapper.deleteByPrimaryKey(roles_id);
=======
		// TODO Auto-generated method stub
		
>>>>>>> gyx
	}

	@Override
	public void update(Roles r) {
<<<<<<< HEAD
		mapper.updateByPrimaryKey(r);
=======
		// TODO Auto-generated method stub
		
>>>>>>> gyx
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
