package io.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.infosys.dao.UserRepository;
import io.infosys.model.Users;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void createUser(Users user) {
		userRepository.save(user);
	}

	public Users getUser(int userID) {
		return userRepository.findById(userID).orElse(null);
	}
	
	
	
	
}
