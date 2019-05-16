package com.class29;

public class Student {

	private String name;
	private int age;
	
	// Create setter methods to set the value
	public void setName(String name)
	{
		if (!name.isEmpty()) {
			this.name=name;
		}	
	}
	
	public void setAge(int age)
	{
		if (age>=18) {
			this.age=age;
		}
	}
	
	// Create getters to return value of variables
	
	public String getName() {
	return name;	
}
	public int getAge() {
		return age;
	}
	
}
//Hierarchical