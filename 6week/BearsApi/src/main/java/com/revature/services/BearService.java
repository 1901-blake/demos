package com.revature.services;

import java.util.List;
import java.util.Set;

import com.revature.model.Bear;

public interface BearService {

	Bear save(Bear b); // add a bear
	Bear update(Bear b);
	Bear delete(Bear b);
	
	List<Bear> findAll();
	Bear findById(int id);
	List<Bear> findByCaveId(int caveId);
	List<Bear> findByLegs(int legs);
	List<Bear> findByColor(String color);
	List<Bear> findByBreed(String breed);
}
