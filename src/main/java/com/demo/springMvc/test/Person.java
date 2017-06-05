package com.demo.springMvc.test;

public class Person {

	private static final String DEFAULT_NAME = "Default Name";
	private static final int DEFAULT_AGE = 0;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public Person() {
		this.name = DEFAULT_NAME;
		this.age = DEFAULT_AGE;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
