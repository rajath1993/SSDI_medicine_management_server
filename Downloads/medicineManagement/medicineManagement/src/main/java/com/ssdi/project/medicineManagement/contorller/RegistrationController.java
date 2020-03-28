package com.ssdi.project.medicineManagement.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssdi.project.medicineManagement.model.User;
import com.ssdi.project.medicineManagement.service.UserService;

@RestController
public class RegistrationController {
	
    @Autowired
    private UserService userService;
    
    @CrossOrigin(origins="http://localhost:4200",maxAge=3600)
    @GetMapping(path="/registration")
    public String saveUser(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String email,@RequestParam String password,@RequestParam String selectedRole) {
    	User user = new User(firstName,lastName,email,password,selectedRole);
    	userService.saveUser(user);
    	return "User saved";
    	
    }
	
	
	@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
	@PostMapping(path="/registration")
	public String newHello(@RequestBody User user) {
		userService.saveUser(user);
		System.out.println(user.toString());
		return "User Added";
	}

}
