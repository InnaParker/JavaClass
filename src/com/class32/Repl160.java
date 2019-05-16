package com.class32;

import java.util.HashSet;
import java.util.Set;

public class Repl160 {

	public static void main(String[] args) {
		/* Create a Set and print the values before deletion and after 
		 * deletion.  Output:  My HashSet content: [third, first, second]
		 * Clearing HasSet: Content after clear: []  */
		
		Set<String> hset=new HashSet<>();
		
		hset.add("third");
		hset.add("first");
		hset.add("second");
		
		System.out.println("My HashSet content:" +hset);
		
		hset.clear();
		System.out.println("Content After clear:"+hset);
	}

}
