package com.projects.java.springbootkafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MediaPostProducerService {
	
	public static final String TOPIC = "post";

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendPost(String message)
	{
		kafkaTemplate.send(TOPIC,message);
	}
}
