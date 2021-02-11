package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.repositories.UserRepository;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
}