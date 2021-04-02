package com.app.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.client.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}
