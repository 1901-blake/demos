package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}
