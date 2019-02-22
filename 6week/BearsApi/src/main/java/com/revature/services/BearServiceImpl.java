package com.revature.services;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Bear;
import com.revature.repos.BearRepo;

@Service
public class BearServiceImpl implements BearService {

	@Autowired
	private BearRepo bearRepo;

	@Transactional
	@Override
	public Bear save(Bear b) {
		b.setId(0);
		return bearRepo.save(b);
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

	@Override
	public List<Bear> findByCaveType(String caveType) {
		return bearRepo.findByCaveCaveTypeIgnoringCase(caveType);
	}


	@Transactional
	@Override
	public List<Bear> saveMultiple(List<Bear> bears) {
		bears.forEach(bear -> {
			save(bear);
		});
		
		// If I throw new RuntimeException Here it prevents transaction from commiting and rolls back
		return bears;
	}

}
