package com.magar.curso.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user") //especificação do nome da tabela do banco de dados
//serializable serve para transformar o objeto em bytes para ter uma movimentação/gravado na rede e em arquivos
public class User implements Serializable  {
	
	//com a implementação do "Serializable" é neccesario colocar um numero de serial
	private static final long serialVersionUID = 1L;
	
	@Id //chave primaria é o id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id uma chave auto incrementavel no bd
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	
	//instaciar a classe Order nessa classe
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
		
	
	// como estamos usando um framework precisamos criar um construtor vazio 
	public User() {
	}
	
	//criar um construtor com todos privates
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	//implementação dos getters e setters(todos os privates)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	
	//implementação do hashcode e equals(só no private id), serve para comparar um objeto com outro

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
