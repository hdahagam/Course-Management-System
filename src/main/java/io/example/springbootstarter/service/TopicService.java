package io.example.springbootstarter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.example.springbootstarter.Topic;

@Service
public interface TopicService {
	
	public List<Topic> getAllTopics();
	
	public Optional<Topic> getTopic(String id);

	public void addTopic(Topic topic);

	public void updateTopic(String id, Topic topic);
	
	public void deleteTopic(String id);

}
