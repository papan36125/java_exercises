package com.arka.javacourse.lesson2;
import static org.junit.Assert.assertEquals;
import com.arka.javacourse.lesson3.Name;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void shouldReturnHelloWorld() {
		Person arka = new Person();
		assertEquals("Hello World", arka.helloWorld());
	}
	
	@Test
	public void shouldReturnHelloArka() {
		Person person = new Person();
		assertEquals("Hello Arka", person.hello("Arka"));
	}
	
	@Test
	public void shouldReturnNumberOfPersons() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person myPerson = new Person();
		
		assertEquals(3, myPerson.numberOfPersons());
	}
}
