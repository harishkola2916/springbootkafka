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
	public static final String MESSAGE_TOPIC = "post";

	@Autowired
	//KafkaTemplate<String, String> kafkaTemplate; //for sending string to topic
	KafkaTemplate<String, MediaPost> kafkaTemplate; //for sending object to topic
	
	/*//Sends message to topic
	public void sendPost(String message)
	{
		kafkaTemplate.send(MESSAGE_TOPIC,message);
	}
	*/
	/**
	 * Sends {@link MediaPost} to topic
	 * @param post
	 */
	public void sendPost(MediaPost post)
	{
		kafkaTemplate.send(MESSAGE_TOPIC,post);
	}
}
