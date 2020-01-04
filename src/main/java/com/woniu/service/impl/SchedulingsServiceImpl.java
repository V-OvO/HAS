package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.SchedulingsMapper;
import com.woniu.domain.Schedulings;
import com.woniu.service.SchedulingsService;


@Service
@Transactional
public class SchedulingsServiceImpl implements SchedulingsService{
    
	@Autowired
	private SchedulingsMapper mapper;
	
	@Override
	public void save(Schedulings s) {
		mapper.insertSelective(s);
	}

	@Override
	public void delete(Integer schedulingsId) {
		mapper.deleteByPrimaryKey(schedulingsId);
	}

	@Override
	public void update(Schedulings s) {
		mapper.updateByPrimaryKey(s);
		
	}

	@Override
	public Schedulings find(Integer schedulingsId) {
		Schedulings s = mapper.selectByPrimaryKey(schedulingsId);
		return s;
	}

	@Override
	public List<Schedulings> find() {
		List<Schedulings> list = mapper.selectByExample(null);
		return list;
	}
	
	

}
