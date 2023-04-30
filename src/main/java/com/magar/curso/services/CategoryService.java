package com.magar.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magar.curso.entities.Category;
import com.magar.curso.repositories.CategoryRepository;

//
@Service
public class CategoryService {
	
	@Autowired //injeção de depedencia 
	private CategoryRepository repository;
	
	//repassa a chamada para repository findAll 
	public List<Category> findAll() {
		return repository.findAll();	
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
