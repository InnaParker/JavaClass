package com.class32;

import java.util.Set;
import java.util.TreeSet;

public class Repl159 {

	public static void main(String[] args) {
		// Create set of string values, add following:
		/* add("India"); 
		* add("Australia"); 
		* add("South Africa"); 
		* add("India");
		* add("America");
		* add("America");
		*/
		
		Set<String> set=new TreeSet<>();
		set.add("India");
		set.add("Australia");
		set.add("South Africa");
		set.add("India");
		set.add("America");
		set.add("America");
				
		System.out.println(set);		
	}
}
