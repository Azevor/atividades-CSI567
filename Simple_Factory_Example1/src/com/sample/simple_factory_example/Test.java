package com.sample.simple_factory_example;

public class Test {

	public static void main(String[] args) {
		FactoryPerson person = new FactoryPerson("Gildo", "M");

		System.out.println(person.sayHelloPerson());
	}
}