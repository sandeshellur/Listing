package com.example.propertyListing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.propertyListing.model.Category;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Integer> {

}
