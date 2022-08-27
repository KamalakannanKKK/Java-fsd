package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    
    @Test
    public void returnUserFromName() {
        UserDetail testUser = new UserDetail();
        testUser.setName("kl rahul");
        testUser.setEmailid("rahul@gmail.com");
        testUser.setPassword("rahul");
        entityManager.persist(testUser);
        entityManager.flush();

        UserDetail found = userRepository.findByName(testUser.getName());
        
        assertEquals(found.getName(), testUser.getName());
    }

    @Test
    public void passwordNotNull() {
    	
		Iterable<UserDetail> users = userRepository.findAll();
		for(UserDetail u: users)
			assertNotNull(u.getPassword());
    }

    @Test
    public void nameNotNull() {
    	
		Iterable<UserDetail> users = userRepository.findAll();
		for(UserDetail u: users)
			assertNotNull(u.getName());
    }

    @Test
    public void emailNotNull() {
    	
		Iterable<UserDetail> users = userRepository.findAll();
		for(UserDetail u: users)
			assertNotNull(u.getEmailid());
    }


}