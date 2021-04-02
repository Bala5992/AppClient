package com.app.client.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.client.model.Role;
import com.app.client.model.User;
import com.app.client.repository.RoleRepository;
import com.app.client.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	 private UserRepository userRepository;
	 
	 @Autowired
	 private RoleRepository roleRespository;
	 
	 @Autowired
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	 @Override
	 public User findUserByEmail(String email) {
		 return userRepository.findByEmail(email);
	 }
	
	 @Override
	 public void saveUser(User user) {
		 user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		 user.setActive(1);
	 	 Role userRole = roleRespository.findByRole("USER");
	 	 user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	 	 userRepository.save(user);
	 }

}