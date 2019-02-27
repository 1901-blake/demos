package com.revature.intercomm;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.model.Account;

@Component
public class AccountClientFallback implements AccountClient {

	@Override
	public List<Account> getAccountsByCustomer(int id) {
		return null;
	}

}
