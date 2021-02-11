package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.dto.UserDTO;
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

	public User insert(User obj) {
		return userRepository.insert(obj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}