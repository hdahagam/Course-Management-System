package io.example.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.springbootstarter.Topic;
import io.example.springbootstarter.dao.TopicDirectory;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicDirectory topicDirectory;
		
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicDirectory.findAll().forEach(topics::add);	
		return topics;
		}
	
	public Optional<Topic> getTopic(String id) {
		return topicDirectory.findById(id);
	}

	public void addTopic(Topic topic) {
		topicDirectory.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicDirectory.save(topic);
	}

	@Override
	public void deleteTopic(String id) {
		topicDirectory.deleteById(id);
	}

}
