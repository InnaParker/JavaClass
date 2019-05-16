package com.class32;

import java.util.HashSet;

public class Repl157 {

	public static void main(String[] args) {
		
		/* How to remove the single elements and how to remove the all the 
		 * elements from the hashSet. Add the values as: first  second  third
		 * fourth  fifth. 1st print all the values. Than delete single element
		 * 2nd, than print the values. Than delete all the elements.
		 * After that print the values. Output:
		 * third, fifth, fourth, first, second
		 * third, fifth, fourth, first.
		 */


		HashSet<String> hset=new HashSet<>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		
		System.out.println(hset);
		
		hset.remove("second");
		System.out.println(hset);
		
		hset.removeAll(hset);
		System.out.println(hset);
	}

}
