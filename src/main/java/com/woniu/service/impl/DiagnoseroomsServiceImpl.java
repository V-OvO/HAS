package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DiagnoseroomsMapper;
import com.woniu.domain.Diagnoserooms;
import com.woniu.service.DiagnoseroomsService;
@Service
@Transactional
public class DiagnoseroomsServiceImpl implements DiagnoseroomsService {
	@Autowired
	private DiagnoseroomsMapper mapper;
	@Override
	public void save(Diagnoserooms obj) {
		// TODO Auto-generated method stub
		mapper.insertSelective(obj);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Diagnoserooms obj) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public Diagnoserooms find(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Diagnoserooms> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}


}
