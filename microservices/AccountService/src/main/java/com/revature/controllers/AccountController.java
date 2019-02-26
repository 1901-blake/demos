package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Account;

@RestController
@RequestMapping("accounts")
public class AccountController {
	
	private List<Account> accounts;
	
	public AccountController() {
		accounts = new ArrayList<>();
		accounts.add(new Account(1, 5000, 1));
		accounts.add(new Account(2, 25, 2));
		accounts.add(new Account(3, 52, 2));
		accounts.add(new Account(4, 89, 2));
		accounts.add(new Account(5, 8021, 1));
		accounts.add(new Account(6, 340892, 3));
		accounts.add(new Account(7, 125, 3));
	}
	
	@GetMapping
	public List<Account> findAll() {
		return accounts;
	}
	
	
	@GetMapping("/ownerId/{owner}")
	public List<Account> findByOwner(@PathVariable int owner) {
		return accounts.parallelStream()
					.filter(acc -> acc.getOwnerId() == owner)
					.collect(Collectors.toList());
	}
	
}
