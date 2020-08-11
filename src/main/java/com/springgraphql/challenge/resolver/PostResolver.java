package com.springgraphql.challenge.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;
import com.springgraphql.challenge.model.User;
import com.springgraphql.challenge.repository.CommentRepository;
import com.springgraphql.challenge.repository.GraphQLDataFetchers;
import com.springgraphql.challenge.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PostResolver  implements GraphQLResolver<Post>{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CommentRepository commentRepository; 
	
	public PostResolver(UserRepository userRepository, CommentRepository commentRepository) {
		this.userRepository = userRepository;
		this.commentRepository = commentRepository;
	}
	
	public User getUser(Post post) {
		return userRepository.getUserByIds(post.getUserId());
	}
	
	public List<Comment> getComments(Post post){
		return commentRepository.getCommentFromPost(post.getId());
	}
}
