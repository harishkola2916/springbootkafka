package com.projects.java.springbootkafka.model;

import javax.validation.constraints.NotEmpty;

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
	@NotEmpty
	private String postContent;
}
