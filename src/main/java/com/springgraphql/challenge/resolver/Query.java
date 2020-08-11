package com.springgraphql.challenge.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;
import com.springgraphql.challenge.model.User;
import com.springgraphql.challenge.repository.CommentRepository;
import com.springgraphql.challenge.repository.PostRepository;
import com.springgraphql.challenge.repository.UserRepository;

@Component
public class Query implements GraphQLQueryResolver {
	private UserRepository userRepository;
	private PostRepository postRepository;
	private CommentRepository commentRepository;

	@Autowired
	public Query( UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
		this.userRepository = userRepository;
		this.postRepository = postRepository;
		this.commentRepository = commentRepository;
	}
	
	
	public List<User> getAllUser() {
		return userRepository.getAllUsers();
	}
	
	public User getUserById(int id) {
		return getAllUser().stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}
	
	public List<Post> getAllPost(){
		return postRepository.getAllPosts();
	}
	
	public Post getPostById(int id){
		return postRepository.getPostById(id);
	}
	
	public List<Comment> getAllComment(){
		return commentRepository.getAllComments();
	}
	
	public Comment getCommentById(int id){
		return commentRepository.getCommentById(id);
	}
	
	public List<Comment> getCommentFromPost(int id){
		return commentRepository.getCommentFromPost(id);
	}		

}
