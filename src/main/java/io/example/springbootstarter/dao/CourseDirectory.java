package io.example.springbootstarter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.example.springbootstarter.Course;


public interface CourseDirectory extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);

}

