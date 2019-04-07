package com.class19;

public class Application {

	public static void main(String[] args) {

		/*
		 * Create another class called Application from this application class create 3
		 * different instances/objects of it and print the properties and
		 * functions/methods
		 */

		Animal animal1 = new Animal();

		System.out.println("This is animal 1");

		System.out.println(animal1.name);
		System.out.println(animal1.breed);
		System.out.println(animal1.age);
		System.out.println(animal1.weight);
		System.out.println(animal1.canBark());
		
		animal1.canBark();
		
		animal1.name="Joe";
		animal1.age=7;
		System.out.println(animal1.age);

		Animal animal2 = new Animal();

		System.out.println("This is animal 2");
		
		System.out.println(animal2.name);
		System.out.println(animal2.breed);
		System.out.println(animal2.age);
		System.out.println(animal2.weight);

		animal2.name = "Roxy";

		System.out.println(animal2.name);

		Animal animal3 = new Animal();

		System.out.println("This is animal 3");
		
		
		
		int[] my_array= {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Minimum.minOfValues(my_array);
		System.out.println("Printing minimum value ");
		System.out.println(Minimum.minOfValues(my_array));
		
		Minimum.maxOfValues(my_array);
		System.out.println("Printing maximum value ");
		System.out.println(Minimum.maxOfValues(my_array));
		
		System.out.println("_________________________________");
		
		Calculator calc=new Calculator();
		
		System.out.println(calc.sum(12, 13, 14));
		System.out.println(calc.average(12, 13, 14));
		System.out.println(calc.min(12, 13, 14));
		System.out.println(calc.max(12, 13, 14));
		
		
	}

}