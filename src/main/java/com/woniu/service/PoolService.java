package com.woniu.service;



import java.util.List;

import com.woniu.domain.Pool;

public interface PoolService {
	void save(Pool p);
	void delete(Integer poolId);
	void update(Pool p);
	Pool find(Integer poolId);
	List<Pool> find();

}
