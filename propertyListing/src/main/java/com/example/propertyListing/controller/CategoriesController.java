package com.example.propertyListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyListing.model.Category;
import com.example.propertyListing.repository.CategoriesRepository;

@RestController
@CrossOrigin(origins = "*")
public class CategoriesController {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@GetMapping("/categories")
	public List<Category> getCities() {
		return (List<Category>) categoriesRepository.findAll();
	}

}