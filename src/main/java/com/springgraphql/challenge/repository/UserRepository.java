package com.springgraphql.challenge.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springgraphql.challenge.model.User;



@Component
public class UserRepository {
		
	public static List<User> users;
	
	public UserRepository() {
		users = GraphQLDataFetchers.getUserJson();
	}
	 	 	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUserByIds(int id) {
		return getAllUsers().stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}
}
