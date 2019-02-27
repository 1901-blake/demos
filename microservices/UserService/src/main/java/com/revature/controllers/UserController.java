package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.intercomm.AccountClient;
import com.revature.model.Account;
import com.revature.model.AppUser;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private AccountClient ac;

	private List<AppUser> users;

	public UserController() {
		users = new ArrayList<>();
		users.add(new AppUser(1, "Lori", "pass", "student", null));
		users.add(new AppUser(2, "Dunieski", "pass", "student", null));
		users.add(new AppUser(3, "Dylan", "pass", "qc", null));
		users.add(new AppUser(4, "Wezley", "pass", "trainer", null));
	}

	@GetMapping
	public List<AppUser> findAll() {
		return users;
	}

	@GetMapping("{id}")
	public ResponseEntity<AppUser> findById(@PathVariable int id) {
		System.out.println("finding user with id: " + id);
		AppUser user = users.parallelStream()
				.filter(u -> u.getId() == id)
				.findFirst().get();
		List<Account> accounts = ac.getAccountsByCustomer(id);
		user.setAccounts(accounts);
		
		if (accounts == null) {
			return new ResponseEntity<AppUser>(user, HttpStatus.PARTIAL_CONTENT);
		} else {
			return new ResponseEntity<AppUser>(user, HttpStatus.OK);
		}
	}

}
