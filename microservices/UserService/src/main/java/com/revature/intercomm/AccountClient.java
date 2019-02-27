package com.revature.intercomm;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.model.Account;

@FeignClient(name = "account-service", fallback=AccountClientFallback.class)
public interface AccountClient {
	@GetMapping("/accounts/ownerId/{id}")
	List<Account> getAccountsByCustomer(@PathVariable("id") int id);
}
