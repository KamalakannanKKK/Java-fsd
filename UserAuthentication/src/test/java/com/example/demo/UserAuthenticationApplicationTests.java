package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserAuthenticationApplicationTests {


	@Autowired
	private UserService userService;
	
	@Test
	void contextLoads() {
	}

	
	@Test
	void testServiceCall() {
		Iterable<UserDetail> users = userService.GetAllUsers();
		int count = 0;
		
		for(UserDetail u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	@Test
	void countUsers() {
		Iterable<UserDetail> users = userService.GetAllUsers();
		int count = 0;
		
		for(UserDetail u: users)
			count++;
		
		assertEquals(count, 2);
	}
	
	@Test
	void checkAllUsers() {
		Iterable<UserDetail> users = userService.GetAllUsers();
		
		for(UserDetail u: users)
			assertNotNull(u);
	}
}
