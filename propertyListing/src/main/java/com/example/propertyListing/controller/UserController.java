package com.example.propertyListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyListing.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	//fetch website reviews
	@GetMapping("/websitereviews")
	public List<String[]> getWebsiteReviews() {
		return userRepository.findWebsiteReviews();
	}

}