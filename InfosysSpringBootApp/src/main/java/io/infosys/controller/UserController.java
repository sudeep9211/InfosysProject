package io.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.infosys.model.Users;
import io.infosys.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody Users user) {
		userService.createUser(user);
	}
	
	@GetMapping("/getUser/{userID}")
	public Users getUser(@PathVariable int userID) {
		return userService.getUser(userID);
	}
	
	
	
}
