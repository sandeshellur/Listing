package com.example.propertyListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyListing.model.Property;
import com.example.propertyListing.repository.PropertiesRepository;

@RestController
@CrossOrigin(origins = "*")
public class PropertiesController {
	
	@Autowired
	PropertiesRepository propertiesRepository;

	// Fetch all properties
	@GetMapping("/propertiesall")
	public List<Property> getPropertiesAll() {
		return (List<Property>) propertiesRepository.findAll();
	}

	// Fetch properties by location
	@GetMapping("/propertybylocation/{locationId}")
	public List<Property> getPropertyByCity(@PathVariable int locationId) {
		return (List<Property>) propertiesRepository.findByLocationId(locationId);
	}

}
