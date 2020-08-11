package com.springgraphql.challenge.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRepositoryTest {
	
	/*@Autowired
	UserRepository userRepository;
	
	
	@Test
	public void testUserReturnUser() throws JsonMappingException, JsonProcessingException {
		Assert.assertNotNull(userRepository.getUser());
		Assert.assertEquals(10, userRepository.getUser().size());
	}*/
	


}
