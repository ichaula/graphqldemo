package com.springgraphql.challenge.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
	
	private int userId;
	private int id;
	private User user;
	private String title;
	private String body;
	private List<Comment> comments;
	
	public Post() {
		super();
	}

	public Post(int userId, int id, User user, String title, String body, List<Comment> comments) {
		super();
		this.userId = userId;
		this.id = id;
		this.user = user;
		this.title = title;
		this.body = body;
		this.comments = comments;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
