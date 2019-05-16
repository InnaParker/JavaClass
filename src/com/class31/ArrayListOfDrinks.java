package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfDrinks {

	public static void main(String[] args) {
		// Create an array list of drinks. If any drink has letter "a"
		// or "e", replace it with water.

		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Tea");
		drinks.add("Wine");
		drinks.add("Kefir");
		drinks.add("Coffee");
		drinks.add("Milk");

		for (int i = 0; i < drinks.size(); i++) {
			String drink = drinks.get(i);
			
			if (drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
		
	}
}
