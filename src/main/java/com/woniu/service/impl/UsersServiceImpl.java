package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
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

}
