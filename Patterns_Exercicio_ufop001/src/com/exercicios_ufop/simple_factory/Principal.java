package com.exercicios_ufop.simple_factory;

/**
 * Classe principal para teste.
 * 
 * @author Gildo Tiago Azevedo - 17.1.8242
 *
 */
public class Principal {

	
	public static void main(String[] args) {
		PizzariaFactory pizza = new PizzariaFactory();
		
		// Comendo pizza sem pedir antes
		System.out.println(pizza.comerPizzaFactory());
		
		pizza.pedirPizza("Calabresa");
		System.out.println(pizza.comerPizzaFactory());
		
		pizza.pedirPizza("4queijos");
		System.out.println(pizza.comerPizzaFactory());
		
		pizza.pedirPizza("Frango");
		System.out.println(pizza.comerPizzaFactory());
		
		pizza.pedirPizza("Mussarela");
		System.out.println(pizza.comerPizzaFactory());
	}
}
