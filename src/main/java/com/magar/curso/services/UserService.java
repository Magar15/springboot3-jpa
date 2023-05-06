package com.magar.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magar.curso.entities.User;
import com.magar.curso.repositories.UserRepository;

//
@Service
public class UserService {
	
	@Autowired //injeção de depedencia 
	private UserRepository repository;
	
	//repassa a chamada para repository findAll 
	public List<User> findAll() {
		return repository.findAll();	
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//iserção de objeto user no banco de dados
	public User insert(User obj) {
		return repository.save(obj);
	}
}
