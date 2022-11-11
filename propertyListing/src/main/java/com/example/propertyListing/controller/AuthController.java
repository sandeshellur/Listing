package com.example.propertyListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyListing.model.User;
import com.example.propertyListing.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {
	
	@Autowired
	UserRepository userRepository;
	
	//Sign Up
	@PostMapping("/signup")
	public User singUp(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/signup")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	//Log In
	@PostMapping("/login")
	public User logIn(@RequestBody User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

}