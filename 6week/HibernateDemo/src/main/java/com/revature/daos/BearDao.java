package com.revature.daos;

import java.util.Set;

import com.revature.model.Bear;

public interface BearDao {
	
	Bear save(Bear b); // add a bear
	Bear update(Bear b);
	Bear delete(Bear b);
	
	Set<Bear> findAll();
	Bear findById(int id);
	Set<Bear> findByCaveId(int caveId);
	Set<Bear> findByLegs(int legs);
	Set<Bear> findByColor(String color);
	Set<Bear> findByBreed(String breed);
}
