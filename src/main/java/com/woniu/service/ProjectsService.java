package com.woniu.service;

import java.util.List;

import com.woniu.domain.Projects;

public interface ProjectsService {
	void save(Projects p);
	void delete(Integer projects_id);
	void update(Projects p);
	Projects find(Integer projects_id);
	List<Projects> find();
	
}
