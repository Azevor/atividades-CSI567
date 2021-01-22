package com.exercicios_ufop.simple_factory;

/**
 * Aplicação do simple factory para instanciação de um tipo de pizza.
 * 
 * @author Gildo Tiago Azevedo - 17.1.8242
 *
 */
public final class PizzariaFactory {
	private Pizza pizza = null;
	
	public PizzariaFactory() {
		pizza = new Pizza();
	}
	
	/**
	 * Construtor de pizza.
	 * @param String : tipo de pizza
	 * @return Object : PizzaTipo
	 */
	public Pizza pedirPizza(String p_Tipo) {
		
		switch(p_Tipo) {
		case "Calabresa":
			return pizza = new PizzaCalabresa();
		case "Frango":
			return pizza = new PizzaFrango();
		case "Mussarela":
			return pizza = new PizzaMussarela();
		case "4queijos":
			return pizza = new PizzaQuatroQueijos();
			default:
				return null;
		}
	}
	
	/**
	 * Texto para teste de instância.
	 * @return "Comendo pizza de ..."
	 */
	public String comerPizzaFactory() {
		return pizza.comerPizza();
	}
}
