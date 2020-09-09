package com.projects.java.springbootkafka.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MediaPost {
	private int postId;
	private String postContent;
}
