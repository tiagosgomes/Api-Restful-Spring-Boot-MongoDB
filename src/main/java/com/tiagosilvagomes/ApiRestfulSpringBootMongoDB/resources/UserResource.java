package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// Também pode ser @GetMapping, dá na maesma.
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brown", "mariabrown@gmail.com");
		User alex = new User("2", "Alex Green", "alexgreen@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
}
