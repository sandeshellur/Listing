package com.example.propertyListing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.propertyListing.model.Property;

@Repository
public interface PropertiesRepository extends CrudRepository<Property, Integer> {

	List<Property> findByLocationId(int locationId);

}
