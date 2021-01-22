package com.sample.simple_factory_example;

public class Man extends Person {

	public Man(String p_Name, String p_Genre) {
		setName(p_Name);
		setGenre(p_Genre);
	}

	@Override
	public String sayHello() {
		return "Ola senhor " + super.getName() + ", seja bem vindo!!";
	}
}