package com.atividadesCSI567.teste_singleton;

public class Singleton {
	 
	 private static Singleton instance;
	 private int id;	 
	 
	 public static Singleton getInstance() {  
		 
	   if (instance == null) {
	      instance = new Singleton();
	   }
	   
	   return instance;
	 }

	 private Singleton() {
		id = 123;
	 }
	 

//atributos e métodos da classe 
    public int getId() {
    	return id;
    }
    
    public void setId(int vId) {
    	id = vId;
    }  
    
}
