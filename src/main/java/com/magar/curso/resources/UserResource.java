package com.magar.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magar.curso.entities.User;

//camada de recursos 

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(3L,"Magal","magal@gmail.com","11910835576","12340");
		return ResponseEntity.ok().body(u);
	}

}
