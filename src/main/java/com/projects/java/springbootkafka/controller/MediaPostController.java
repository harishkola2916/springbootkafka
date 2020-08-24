/**
 * 
 */
package com.projects.java.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projects.java.springbootkafka.services.MediaPostProducerService;

/**
 * @author haree
 *
 */
@RestController
@RequestMapping(value = "/media")
public class MediaPostController {
	@Autowired
	private MediaPostProducerService mediaPostProducerService;
	
	@PostMapping(value = "/publish")
	void sendPostToPage(@RequestParam("message") String message)
	{
		mediaPostProducerService.sendPost(message);
	}
	
}
