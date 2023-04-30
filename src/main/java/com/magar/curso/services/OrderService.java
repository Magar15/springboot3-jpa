package com.magar.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magar.curso.entities.Order;
import com.magar.curso.repositories.OrderRepository;

//
@Service
public class OrderService {
	
	@Autowired //injeção de depedencia 
	private OrderRepository repository;
	
	//repassa a chamada para repository findAll 
	public List<Order> findAll() {
		return repository.findAll();	
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
