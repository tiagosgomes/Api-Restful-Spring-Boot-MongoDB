package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.Post;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.repositories.PostRepository;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
}