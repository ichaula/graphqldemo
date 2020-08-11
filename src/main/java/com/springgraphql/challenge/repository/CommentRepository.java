package com.springgraphql.challenge.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;


@Component
public class CommentRepository {
	
	public static List<Comment> comments;
	
	public CommentRepository() {
		comments = GraphQLDataFetchers.getCommentJson();
	}
	
	public List<Comment> getAllComments() {
		return comments;
	}
	
	public Comment getCommentById(int id){
		return getAllComments().stream().filter(comment -> comment.getId() == id).findFirst().orElse(null);
	}
	
	public List<Comment> getCommentFromPost(int postId){
		return getAllComments().stream().filter(comment -> comment.getPostId() == postId).collect(Collectors.toList());
	}

	

}
