package com.magar.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magar.curso.entities.OrderItem;


//não será necessario colocar uma inplementação na interface o jpa já faz isso
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
