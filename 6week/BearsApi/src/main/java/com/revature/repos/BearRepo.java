package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Bear;

public interface BearRepo extends JpaRepository<Bear, Integer> {
	List<Bear> findByBreed(String breed);

	List<Bear> findByCaveCaveTypeIgnoringCase(String caveType);

}
