package com.atividadesCSI567.teste_singleton;

public class SingletonTeste {
	
	public static void main(String[] args) {
		
	    Singleton s1 = Singleton.getInstance();
	    System.out.println(s1.getId());
	    s1.setId(345);
	    System.out.println(s1.getId());
	
	// Criar um novo objeto		
	    Singleton s2 = Singleton.getInstance();
	    System.out.println(s2.getId());
	    
	    if(s1 == s2) {
	    	System.out.println("s1 e s2 são os mesmos objetos");
	    }
			
	  }
	

}
