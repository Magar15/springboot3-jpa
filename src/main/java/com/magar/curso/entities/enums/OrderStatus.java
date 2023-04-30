package com.magar.curso.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//codigo do inumerado acima
	private int code;
	
	//contrutor para o code
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//para o codigo ficar acessivel 
	public int getCode() {
		return code;
	}
	
	//para n precisar instanciar, esse comando serve para achar um numero(entre 1 a 5) e imprimir ele
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		//lançar uma exceção
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
