package io.example.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.springbootstarter.Course;
import io.example.springbootstarter.dao.CourseDirectory;


@Service
public class CourseService {
	
	@Autowired
	private CourseDirectory courseDirectory;
		
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseDirectory.findByTopicId(topicId)
		.forEach(courses::add);	
		return courses;
		}
	 
	public Optional<Course> getCourse(String id) {
		return courseDirectory.findById(id);
	}

	public void addCourse(Course course) {
		courseDirectory.save(course);
	}

	public void updateCourse(Course course) {
		courseDirectory.save(course);
	}

	public void deleteCourse(String id) {
		courseDirectory.deleteById(id);
	}
}
