package com.sample.simple_factory_example;

public class Woman extends Person {

	public Woman(String p_Name, String p_Genre) {
		setName(p_Name);
		setGenre(p_Genre);
	}

	@Override
	public String sayHello() {
		return "Ola senhora " + super.getName() + ", seja bem vinda!!";
	}
}