package com.app.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.client.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);

}
