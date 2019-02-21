package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.model.AppUser;

@Repository
public class UserDaoDummyImpl implements UserDao {

	@Override
	public AppUser findById(int id) {
		return new AppUser(id, "user" + id, "pass", "user");
	}

	@Override
	public List<AppUser> findAll() {
		List<AppUser> users = new ArrayList<AppUser>();
		users.add(new AppUser(1, "user1", "pass", "user"));
		users.add(new AppUser(2, "user2", "pass", "user"));
		return users;
	}

}
