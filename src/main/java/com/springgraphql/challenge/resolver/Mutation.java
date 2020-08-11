package com.springgraphql.challenge.resolver;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;
import com.springgraphql.challenge.model.User;
import com.springgraphql.challenge.repository.CommentRepository;
import com.springgraphql.challenge.repository.PostRepository;
import com.springgraphql.challenge.repository.UserRepository;



@Component
public class Mutation implements GraphQLMutationResolver {
	
	private UserRepository userRepository;
	private PostRepository postRepository;
	private CommentRepository commentRepository;

	@Autowired
	public Mutation( UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
		this.userRepository = userRepository;
		this.postRepository = postRepository;
		this.commentRepository = commentRepository;
	}

	public boolean deletePost(int id) {		
		postRepository.getAllPosts().stream().filter(post -> post.getId() != id).collect(Collectors.toList());	
		return true;
	}

	public boolean deleteUser(int id) {		
		userRepository.getAllUsers().stream().filter(user -> user.getId() != id).collect(Collectors.toList());	
		return true;
	}
	
	public boolean deleteComment(Long id) {
		commentRepository.getAllComments().stream().filter(comment -> comment.getId() != id).collect(Collectors.toList());	
		return true;
	}
	
	public Post updatePost(int id, String title, String body) {		
		Post post = postRepository.getPostById(id);
				
		if(null != title) {
			post.setTitle(title);
		}
		if(null != body) {
			post.setBody(body);
		}
		return post;				
	}
	
	public User updateUser(int id, String name, String username, String email, String phone, String website) {
		User user = userRepository.getUserByIds(id);
		if(null != name) {
			user.setName(name);
		}
		if(null != username) {
			user.setUsername(username);
		}
		if(null != email) {
			user.setEmail(email);
		}
		if(null != phone) {
			user.setPhone(phone);
		}
		if(null != website) {
			user.setWebsite(website);
		}
		
		return user;
	}
	
	public Comment updateComment(int id, String name, String email, String body){		
		Comment comment = commentRepository.getCommentById(id);
				
		if(null != name) {
			comment.setName(name);
		}
		if(null != email) {
			comment.setEmail(email);
		}
		if(null != body) {
			comment.setBody(body);
		}
		return comment;				
	}
	
}
