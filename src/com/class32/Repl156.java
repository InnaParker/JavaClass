package com.class32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Repl156 {

	public static void main(String[] args) {
		/* Write program  to iterate the values (use Iterator) through 
		 * HashSet. Add the values as - first  second  third  fourth 
		 * fifth. 
		 * Output:  first  second  third  fourth  fifth
		 * Does HashSet contains first element? true.
		 */

		HashSet<String> hset=new LinkedHashSet<>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		
		
		Iterator<String> iterator=hset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("true");
	}
}
