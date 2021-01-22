package com.exercicios_ufop.simple_factory;

/**
 * Implementação generalizada de uma pizza.
 * 
 * @author Gildo Tiago Azevedo - 17.1.8242
 *
 */
public class Pizza {
	private String m_Tipo;
	
	public String getTipo() {
		return m_Tipo;
	}
	
	public String comerPizza() {
		// TODO action
		return "Voce ainda não pediu uma pizza :)";
	}
}
