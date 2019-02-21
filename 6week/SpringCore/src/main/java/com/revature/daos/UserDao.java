package com.revature.daos;

import java.util.List;

import com.revature.model.AppUser;

public interface UserDao {
	AppUser findById(int id);

	List<AppUser> findAll();
}
