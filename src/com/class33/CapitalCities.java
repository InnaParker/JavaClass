package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CapitalCities {

	public static void main(String[] args) {
		/* Create a map of countries with its capital. Print all keys and values 
		 * from a country map using for each loop and iterator. Print all values 
		 * from a country map using for each loop and iterator.
		 */
		
		HashMap<String, String> cities = new HashMap<String, String>();

	    
	    cities.put("Peru", "Lima");
	    cities.put("Germany", "Berlin");
	    cities.put("Jamaica", "Kingston");
	    cities.put("USA", "Washington DC");
	    

		System.out.println("------List of countries:");
		Collection<String> country=cities.keySet();
		
		for (String city: country) {
			System.out.print(city+" ");
		}
		System.out.println();
		System.out.println("------List of countries with capitals:");
		for (String city: country) {
			System.out.print(city+" "+cities.get(city));
		}
		System.out.println();
		System.out.println("------List of capitals:");
		Collection<String> cap=cities.values();
		
		Iterator<String> capitalIt=cap.iterator();
		while (capitalIt.hasNext()) {
			System.out.print(capitalIt.next()+" ");
		}
		
		
		
	}
}
