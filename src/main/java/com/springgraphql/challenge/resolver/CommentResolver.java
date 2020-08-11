package com.springgraphql.challenge.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.springgraphql.challenge.model.Comment;
import com.springgraphql.challenge.model.Post;
import com.springgraphql.challenge.repository.PostRepository;

@Component
public class CommentResolver  implements GraphQLResolver<Comment>{
	
	@Autowired
	private PostRepository postRepository;
	
	
	public CommentResolver(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public Post getPost(Comment comment){
		return postRepository.getPostById(comment.getPostId());
	}
	

}
