package com.magar.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magar.curso.entities.Product;
import com.magar.curso.repositories.ProductRepository;

//
@Service
public class ProductService {
	
	@Autowired //injeção de depedencia 
	private ProductRepository repository;
	
	//repassa a chamada para repository findAll 
	public List<Product> findAll() {
		return repository.findAll();	
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
