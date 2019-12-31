package com.woniu.service;

import java.util.List;

import com.woniu.domain.Users;

public interface UsersService {

	void save(Users users);

	void delete(Integer usersId);

	void update(Users users);

	Users find(Integer usersId);

	List<Users> find();
}
