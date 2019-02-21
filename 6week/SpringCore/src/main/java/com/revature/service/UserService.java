package com.revature.service;

import java.util.List;

import com.revature.model.AppUser;

public interface UserService {
	AppUser findById(int id);
	List<AppUser> findAll();
}
