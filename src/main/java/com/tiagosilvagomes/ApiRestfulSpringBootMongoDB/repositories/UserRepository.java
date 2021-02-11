package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
