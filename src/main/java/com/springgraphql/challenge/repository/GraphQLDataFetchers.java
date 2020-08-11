package com.springgraphql.challenge.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;
import com.springgraphql.challenge.model.User;

@Component
public class GraphQLDataFetchers {
	
	public static List<User> getUserJson() {
	    RestTemplate restTemplate = new RestTemplate();
        String theUrl = "https://jsonplaceholder.typicode.com/users";
        ResponseEntity<List<User>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
        });
        List<User> todoList = response.getBody();
        return todoList;
    }
	
	public static List<Post> getPostJson() {
	    RestTemplate restTemplate = new RestTemplate();
        String theUrl = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Post>>() {
        });
        List<Post> todoList = response.getBody();
        return todoList;
    }
	
	public static List<Comment> getCommentJson() {
	    RestTemplate restTemplate = new RestTemplate();
        String theUrl = "https://jsonplaceholder.typicode.com/comments";
        ResponseEntity<List<Comment>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Comment>>() {
        });
        List<Comment> todoList = response.getBody();
        return todoList;
    }

}
