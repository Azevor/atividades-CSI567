package com.sample.simple_factory_example;

public class Person {
	private String m_Name;
	private String m_Genre;

	public String getName() {
		return m_Name;
	}

	public String getGenre() {
		return m_Genre;
	}
	
	public void setName(String p_Name) {
		m_Name = p_Name;
	}
	
	public void setGenre(String p_Genre) {
		m_Genre = p_Genre;
	}
	
	public String sayHello() {
		return null;
	}
}