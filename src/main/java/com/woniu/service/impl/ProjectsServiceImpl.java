package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProjectsMapper;
import com.woniu.domain.Projects;
import com.woniu.service.ProjectsService;

@Service
@Transactional
public class ProjectsServiceImpl implements ProjectsService {
	
	@Autowired
	private ProjectsMapper mapper;

	@Override
	public void save(Projects p) {
		// TODO Auto-generated method stub
		mapper.insertSelective(p);
	}

	@Override
	public void delete(Integer projects_id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(projects_id);
	}

	@Override
	public void update(Projects p) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public Projects find(Integer projects_id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(projects_id);
	}

	@Override
	public List<Projects> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}


}
