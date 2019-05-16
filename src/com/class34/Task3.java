package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {

		 /* Create a Person class with following private fields: name, lastName, age,
		 * salary. Variables should be initialized through constructor. Inside the class
		 * also create a method to print user details. In Test Class create a Map to
		 * store personId and a Person Object. Print each object details.
		 */

		Map<Integer, Person> person = new HashMap<>();
		person.put(001, new Person("James", "Riddle", 35, 60000.00));
		person.put(002, new Person("Linda", "Matthews", 40, 70100.00));
		person.put(003, new Person("Jack", "Matthews", 45, 70100.00));

		for (Person detail : person.values()) {
			detail.userDetails();
		}
	}
}

class Person {

	private String name;
	private String lastName;
	private int age;
	private double salary;

	public Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public void userDetails() {
		System.out.println("Full name is " + name + " " + lastName + " age is " + age + " and salaray " + salary);
	}
}
