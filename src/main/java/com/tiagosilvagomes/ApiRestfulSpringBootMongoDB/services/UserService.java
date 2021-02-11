package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}
}