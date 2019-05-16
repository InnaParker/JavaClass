package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayOfCars {

	public static void main(String[] args) {
		// Create an arraylist of cars and retrieve all the values
		// using 4 different ways.

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");

		System.out.println("----1st way using for loop");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----2nd way advanced for loop");
		for(String Object: cars) {
			System.out.println(Object);
		}
		
		System.out.println("----3rd way using iterator");
		
		Iterator<String> it=cars.iterator();
		while(it.hasNext()) {
		
			System.out.println(it.next());
		}
		System.out.println("----4th way using while loop");
		int i=0;
		while(i<cars.size()) {
			System.out.println(cars.get(i));
			i++;
		}
}
}
