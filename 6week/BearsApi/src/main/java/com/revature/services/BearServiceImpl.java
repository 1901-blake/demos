package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Bear;
import com.revature.repos.BearRepo;

@Service
public class BearServiceImpl implements BearService {

	@Autowired
	private BearRepo bearRepo;

	@Override
	public Bear save(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear update(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear delete(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bear> findAll() {
		return bearRepo.findAll();
	}

	@Override
	public Bear findById(int id) {
		return bearRepo.getOne(id);
	}

	@Override
	public List<Bear> findByCaveId(int caveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bear> findByLegs(int legs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bear> findByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bear> findByBreed(String breed) {
		return bearRepo.findByBreed(breed);
	}

}
