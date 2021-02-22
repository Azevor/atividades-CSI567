package com.atividadesCSI567.teste_singleton;

public class ContadorGlobal {
	
	private ContadorGlobal () {
		
	}
	
	private static int numero = 1;
	
	private static ContadorGlobal instancia = new ContadorGlobal();
	
	public static ContadorGlobal getInstancia() {
		return instancia;
	}
	
	public static void incrementa() {
		numero++;
	}
	
	public static int getNumero() {
		return numero;
	}

}
