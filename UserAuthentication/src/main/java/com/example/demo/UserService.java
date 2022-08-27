package com.example.demo;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserService {
	
	@Autowired
	 private UserRepository userRepository;
	public boolean addFeedback( UserDetail f) {
		userRepository.save(f);
		return true;
	}
	

    public Iterable<UserDetail> GetAllUsers()
    {
        return userRepository.findAll();
    }


    public UserDetail GetUserByName(String name) {
        UserDetail foundUser = userRepository.findByName(name);
        
        return foundUser;
    }
    
    public UserDetail GetUserById(int id) {
    	Optional<UserDetail> foundUser = userRepository.findById(id);
    	
    	
    	//TODO: we need to decide how to handle a "Not Found" condition
    	
    	if (!foundUser.isPresent()) {
    		throw new UserNotFoundException();
    	}
    	
    	return(foundUser.get());
    }
    
    public void UpdateUser(UserDetail usertoUpdate) {
    	userRepository.save(usertoUpdate);
    }


}