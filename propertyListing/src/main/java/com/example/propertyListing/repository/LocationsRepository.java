package com.example.propertyListing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.propertyListing.model.Location;

@Repository
public interface LocationsRepository extends CrudRepository<Location, Integer> {

}
