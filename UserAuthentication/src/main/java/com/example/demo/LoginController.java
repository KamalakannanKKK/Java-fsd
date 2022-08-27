package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	UserService userservice;
@Autowired
UserRepository userRepository;
   @PostMapping("/loginadd")
    public String showLogin(@RequestParam("name") String name, @RequestParam("emailid") String emailid, @RequestParam("Password") String Password) {
        UserDetail u = new UserDetail(name,Password,emailid);
        boolean data= userservice.addFeedback(u);
    	if(data) {
    		return "  succesfully Added !";
    	}
    	else {
    		return "Soerry! Unable to add ";
    	}
    }
    @GetMapping("/allusers")
   	public @ResponseBody String getAll() {
           Iterable<UserDetail> allUser = userRepository.findAll();
   		return "All User Information"+allUser.toString();
    }
    @GetMapping("/adminlogin")
    public String submitLogin(@RequestParam String name, @RequestParam String Password){
       if(name.equals("kamal")& Password.equals("kamal") ){
    	   return "Logged in Successfully";
       }
       else {
           return "Invalid credentials";
       }
    }
}
