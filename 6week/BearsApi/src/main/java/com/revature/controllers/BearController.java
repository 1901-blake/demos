package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Bear;
import com.revature.services.BearService;

@RestController
@RequestMapping("bears")
public class BearController {

	@Autowired
	private BearService bearService;

	@GetMapping
	public List<Bear> findAll() {
		return bearService.findAll();
	}

	@GetMapping("{id}")
	public Bear findById(@PathVariable int id) {
		return bearService.findById(id);
	}

	@GetMapping("breed/{breed}")
	public List<Bear> findById(@PathVariable String breed) {
		return bearService.findByBreed(breed);
	}

	@GetMapping("cave/cave-type/{caveType}")
	public List<Bear> findByCaveType(@PathVariable String caveType) {
		return bearService.findByCaveType(caveType);
	}
	
	@PostMapping
	public Bear save(@Valid @RequestBody Bear b) {
		return bearService.save(b);
	}

	@PostMapping("test-transactions")
	public List<Bear> testTransactions(@RequestBody List<Bear> bears) {
		return bearService.saveMultiple(bears);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptions(Exception e) {
		
		return new ResponseEntity<String>("An error has occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
