package com.projects.java.springbootkafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.projects.java.springbootkafka.model.MediaPost;

/**
 * Consumer Service listens for messages from producer
 * @author haree
 *
 */
@Service
public class MediaPostConsumerService {
	public static final String GROUPID = "group_id";
	private final Logger logger = 
            LoggerFactory.getLogger(MediaPostConsumerService.class);

	/**
	 * Reads {@link MediaPost} received from producer through topic
	 * @param post
	 */
	@KafkaListener(topics = "post", 
            groupId = GROUPID)
	public void readPosts(MediaPost post)
	{
		logger.info(String.format("Message recieved -> %s", post.toString()));
	}
	
	/**
	 * Reads messages{@link MediaPost} received from producer through topic
	 * @param message
	 */
	@KafkaListener(topics = "message", 
            groupId = GROUPID)
	public void readMessages(String message)
	{
		logger.info(String.format("Message recieved -> %s", message));
	}
	
}
