package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ProjectsMapper;
import com.woniu.domain.Projects;
import com.woniu.service.ProjectsService;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	
	@Autowired
	private ProjectsMapper mapper;

	@Override
	public void save(ProjectsService r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer projects_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProjectsService r) {
		// TODO Auto-generated method stub

	}

	@Override
	public Projects find(Integer projects_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Projects> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
