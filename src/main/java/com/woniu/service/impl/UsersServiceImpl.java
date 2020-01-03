package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;

	@Override
	public void save(Users users) {
		usersMapper.insert(users);
	}

	@Override
	public void delete(Integer usersId) {
		usersMapper.deleteByPrimaryKey(usersId);
	}

	@Override
	public void update(Users users) {
		usersMapper.updateByPrimaryKey(users);
	}

	@Override
	public Users find(Integer usersId) {
		Users users = usersMapper.selectByPrimaryKey(usersId);
		return users;
	}

	@Override
	public List<Users> find() {
		List<Users> users = usersMapper.selectByExample(null);
		return users;
	}

	@Override
	public void grantRolesToUser(Integer usersId, Integer[] rolesId) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("usersId", usersId);
		for (Integer rid : rolesId) {
			map.put("rolesId", rid);
			usersMapper.insertrp(map);
		}
	}

	@Override
	public void revokeRolesFromUserByUsersId(Integer usersId) {
		usersMapper.revokeRolesFromUsersId(usersId);
	}

	@Override
	public List<Roles> seleteRolesByUsersId(Integer usersId) {
		List<Roles> roles = usersMapper.seleteRolesByUsersId(usersId);
		return roles;
	}

}
