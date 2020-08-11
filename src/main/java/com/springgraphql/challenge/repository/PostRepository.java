package com.springgraphql.challenge.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springgraphql.challenge.model.Post;



@Component
public class PostRepository {
	
	public static List<Post> posts;
	
	public PostRepository() {
		posts = GraphQLDataFetchers.getPostJson();		
	}
	
	public List<Post> getAllPosts() {		
		return posts;
	}
	
	public Post getPostById(int id) {		
		return getAllPosts().stream().filter(post -> post.getId() == id).findFirst().orElse(null);
	}
}
