package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DoctorsMapper;
import com.woniu.domain.Doctors;
import com.woniu.service.DoctorService;

@Service
@Transactional
public class DoctorsServiceImpl implements DoctorService {
	@Autowired
	private DoctorsMapper doctorsMapper;

	@Override
	public void save(Doctors doctors) {
		doctorsMapper.insert(doctors);
	}

	@Override
	public void delete(Integer doctorsId) {
		doctorsMapper.deleteByPrimaryKey(doctorsId);
	}

	@Override
	public void update(Doctors doctors) {
		doctorsMapper.updateByPrimaryKey(doctors);
	}

	@Override
	public Doctors find(Integer doctorsId) {
		Doctors doctors = doctorsMapper.selectByPrimaryKey(doctorsId);
		return doctors;
	}

	@Override
	public List<Doctors> find() {
		List<Doctors> doctors = doctorsMapper.selectByExample(null);
		return doctors;
	}

}
