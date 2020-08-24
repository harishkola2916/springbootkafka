package com.projects.java.springbootkafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MediaPostConsumerService {
	public static final String GROUPID = "group_id";
	private final Logger logger = 
            LoggerFactory.getLogger(MediaPostConsumerService.class);

	@KafkaListener(topics = "post", 
            groupId = GROUPID)
	public void readMessages(String message)
	{
		logger.info(String.format("Message recieved -> %s", message));
	}
	
}