package com.woniu.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PoolMapper;
import com.woniu.domain.Pool;
import com.woniu.service.PoolService;

@Service
@Transactional
public class PoolServiceImpl implements PoolService {
	@Autowired
	private PoolMapper mapper;

	@Override
	public void save(Pool p) {
		mapper.insertSelective(p);
	}

	@Override
	public void delete(Integer poolId) {
		mapper.deleteByPrimaryKey(poolId);
	}

	@Override
	public void update(Pool p) {
		mapper.updateByPrimaryKey(p);

	}

	@Override
	public Pool find(Integer poolId) {
		Pool pool = mapper.selectByPrimaryKey(poolId);
		return pool;
	}

	@Override
	public List<Pool> find() {
		List<Pool> list = mapper.selectAll();
		return list;
	}



}
