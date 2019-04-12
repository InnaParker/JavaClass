package com.class21;

public class StaticVariables {

	static String breed = "Husky";
	static int paws = 4;
	String name;
	int weight;
	int height;

	public static void main(String[] args) {

		StaticVariables dog1 = new StaticVariables();

		dog1.name = "Mardy";
		dog1.weight = 60;
		dog1.height = 40;
		dog1.getDogProperties();

		StaticVariables dog2 = new StaticVariables();

		dog2.name = "Waffle";
		dog2.weight = 100;
		dog2.height = 90;
		dog2.getDogProperties();


		StaticVariables dog3 = new StaticVariables();
		
		dog3.breed = "Pug";  //if you change static variable on one of the objects 
		                     //it will affect all other objects
		
		dog3.name = "Lucy";
		dog3.weight = 20;
		dog3.height = 30;
		
		dog3.getDogProperties();
		
		dog1.getDogProperties(); //properties of dog 1 has changed
		
		
		// 3 ways to of accessing static variables
		System.out.println(breed);
		System.out.println(dog1.breed); //by object reference - not preferred
		System.out.println(StaticVariables.breed); //by class name
	}
	
	public void getDogProperties()
	{
		System.out.println(name+ " is a breed of "+breed+" and weight is "+weight+" and height is "+height);
		
	}
}
