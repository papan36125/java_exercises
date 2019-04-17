package com.arka.javacourse.lesson2;
import com.arka.javacourse.lesson3.Name;

class Person {
	private Name personName;
	private static int numOfObjects = 0;
	String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
	
	public Person(Name personName) {
		this.personName = personName;
		numOfObjects++;
	}
	
	public Person() {
		/*
		Default constructor.
		*/
		numOfObjects++;
	}
	
	public Name name(){
		return personName;
	}

	public String hello(String name) {
		// TODO Auto-generated method stub
		helloWorld();
		return "Hello " + name;
	}

	public int numberOfPersons() {
		// TODO Auto-generated method stub
		return numOfObjects;
	}
}
