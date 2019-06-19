package io.example.springbootstarter.dao;

import org.springframework.data.repository.CrudRepository;

import io.example.springbootstarter.Topic;


public interface TopicDirectory extends CrudRepository<Topic, String> {
	
}
