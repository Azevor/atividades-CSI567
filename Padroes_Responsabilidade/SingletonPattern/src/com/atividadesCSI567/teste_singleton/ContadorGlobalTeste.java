package com.atividadesCSI567.teste_singleton;

public class ContadorGlobalTeste {
	
	public static void main(String[] args) {
		
		ContadorGlobal /*c1,*/ c2, c3;
		
		// c1 = new ContadorGlobal (); // nao compila!
		
		c2 = ContadorGlobal.getInstancia();
		c3 = ContadorGlobal.getInstancia();
		
		if (c2 == c3) {
			System.out.println("c2 e c3 são mesmo objeto!");
		}
		
		c2.incrementa();
		
		System.out.println("c2 = " + c2.getNumero());
		System.out.println("c3 = " + c3.getNumero());
		
		c3.incrementa();
		
		System.out.println("c2 = " + c2.getNumero());
		System.out.println("c3 = " + c3.getNumero());
		}

}
