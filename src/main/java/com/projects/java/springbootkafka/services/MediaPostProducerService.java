package com.projects.java.springbootkafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.projects.java.springbootkafka.model.MediaPost;

/**
 * Producer service sends messages to topic
 * @author haree
 *
 */
@Service
public class MediaPostProducerService {	
	public static final String MESSAGE_TOPIC = "message";
	public static final String OBJECT_TOPIC = "post";
	

	@Autowired
	KafkaTemplate<String, String> kafkaStringTemplate; //for sending string to topic
	
	@Autowired
	KafkaTemplate<String, MediaPost> kafkaObjectTemplate; //for sending object to topic
	
	/* Sends message to topic
	 * 
	 */
	public void sendMessage(String message)
	{
		kafkaStringTemplate.send(MESSAGE_TOPIC,message);
	}
	
	/**
	 * Sends {@link MediaPost} to topic
	 * @param post
	 */
	public void sendPost(MediaPost post)
	{
		kafkaObjectTemplate.send(OBJECT_TOPIC,post);
	}
}
