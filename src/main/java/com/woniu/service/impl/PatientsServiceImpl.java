package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PatientsMapper;
import com.woniu.domain.Patients;
import com.woniu.service.PatientsService;
@Service
@Transactional
public class PatientsServiceImpl implements PatientsService {
	@Autowired
	private PatientsMapper mapper;

	@Override
	public void save(Patients obj) {
		System.out.println(obj);
		// TODO Auto-generated method stub
		mapper.insertSelective(obj);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Patients obj) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public Patients find(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Patients> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}
	

}
