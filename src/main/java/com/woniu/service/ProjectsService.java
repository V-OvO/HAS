package com.woniu.service;

import java.util.List;

import com.woniu.domain.Projects;

public interface ProjectsService {
	void save(ProjectsService r);
	void delete(Integer projects_id);
	void update(ProjectsService r);
	Projects find(Integer projects_id);
	List<Projects> find();
	
}
