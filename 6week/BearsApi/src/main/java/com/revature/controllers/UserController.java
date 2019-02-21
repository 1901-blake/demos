package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.AppUser;

@RestController
@RequestMapping("users")
public class UserController {

	List<AppUser> users = new ArrayList<>();

	{
		users.add(new AppUser(1, "Kyle", "password", "associate"));
		users.add(new AppUser(2, "Alec", "password", "associate"));
		users.add(new AppUser(3, "Blake", "password", "trainer"));
		users.add(new AppUser(4, "Steve", "password", "manager"));
		users.add(new AppUser(5, "Nick", "password", "trainer"));
	}

	@GetMapping
	public List<AppUser> findAll() {
		return users;
	}

	@GetMapping("role/{role}")
	public List<AppUser> findByRole(@PathVariable String role) {
		return users.stream().filter(user -> user.getRole().equals(role)).collect(Collectors.toList());
	}

	@GetMapping("{id}")
	public ResponseEntity<AppUser> findById(@PathVariable int id) {
		for (AppUser user : users) {
			if (user.getId() == id) {
			}
		}
		return new ResponseEntity<AppUser>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public AppUser save(@RequestBody AppUser user) {
		user.setId(users.size() + 1);
		users.add(user);
		return user;
	}

}
