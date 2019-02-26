package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.AppUser;

@RestController
@RequestMapping("users")
public class UserController {
	
	private List<AppUser> users;
	
	public UserController() {
		users = new ArrayList<>();
		users.add(new AppUser(1, "Lori", "pass", "student"));
		users.add(new AppUser(2, "Dunieski", "pass", "student"));
		users.add(new AppUser(3, "Dylan", "pass", "qc"));
		users.add(new AppUser(4, "Wezley", "pass", "trainer"));
	}
	
	@GetMapping
	public List<AppUser> findAll() {
		return users;
	}
	
}
