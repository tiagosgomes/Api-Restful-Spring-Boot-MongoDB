package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.domain.User;
import com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;

	// Também pode ser @GetMapping, dá na maesma.
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
