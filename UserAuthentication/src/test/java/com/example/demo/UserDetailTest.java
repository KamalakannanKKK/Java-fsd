package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.example.demo.UserDetail;
class UserDetailTest {

	@Test
	public void getAndSetPassword() {
		UserDetail testUser = new UserDetail();
		
		testUser.setPassword("kamal");
		assertEquals(testUser.getPassword(),"kamal");
	}
	
	@Test
	public void getAndSetName() {
		UserDetail testUser = new UserDetail();
		
		testUser.setName("kamal");
		assertEquals(testUser.getName(),"kamal");
	}
	
	@Test
	public void getAndSetEmail() {
		UserDetail testUser = new UserDetail();
		
		testUser.setEmailid("joe@email.com");
		assertEquals(testUser.getEmailid(),"joe@email.com");
	}
	
	@Test
	public void checkToString() {
		UserDetail testUser = new UserDetail();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		UserDetail testUser = new UserDetail("kamal","kamal","kamal@gmail.com");
		UserDetail checkUser = new UserDetail();
		checkUser.setName("kamal");
		checkUser.setPassword("kamal");
		checkUser.setEmailid("kamal@gmail.com");
		
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmailid(), checkUser.getEmailid());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		UserDetail testUser = new UserDetail();
		
		assertNotNull(testUser);
	}

}
