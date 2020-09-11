/**
 * 
 */
package com.projects.java.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projects.java.springbootkafka.model.MediaPost;
import com.projects.java.springbootkafka.services.MediaPostProducerService;

/**
 * Controller to publish a post to producer service
 * @author haree
 *
 */
@RestController
@RequestMapping(value = "/api")
public class MediaPostController {
	
	@Autowired
	private MediaPostProducerService mediaPostProducerService;
	
	/*
	/**
	 * Posts message from request to producer
	 * @param message
	 */
	@PostMapping(value = "/media/welcome")
	void sendPostMessageToPage(@RequestParam("message") String message)
	{
		mediaPostProducerService.sendMessage(message);
	}	
	
	
	/**
	 * Posts {@link MediaPost} received from request as request body to producer
	 * @param post {@link MediaPost}
	 */
	@PostMapping(value = "/media/publish")
	void sendPostMessageToPage(@RequestBody MediaPost post)
	{
		mediaPostProducerService.sendPost(post);
	}
}
