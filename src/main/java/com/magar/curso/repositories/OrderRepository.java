package com.magar.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magar.curso.entities.Order;


//não será necessario colocar uma inplementação na interface o jpa já faz isso
public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
