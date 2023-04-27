package com.magar.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magar.curso.entities.User;


//não será necessario colocar uma inplementação na interface o jpa já faz isso
public interface UserRepository extends JpaRepository<User, Long> {
	

}
