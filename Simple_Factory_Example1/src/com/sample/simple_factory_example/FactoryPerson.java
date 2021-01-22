package com.sample.simple_factory_example;

public final class FactoryPerson {
	private Person person = null;
	
	public FactoryPerson(String p_Name, String p_Genre) {
		createPerson(p_Name, p_Genre);
	}
	
	public Person createPerson(String p_Name, String p_Genre) {
		switch(p_Genre) {
			case "M":
				return person = new Man(p_Name, p_Genre);
			case "F":
				return person = new Woman(p_Name, p_Genre);
			default:
				return person;
		}
	}
	
	public String sayHelloPerson() {
		return person.sayHello();
	}
}