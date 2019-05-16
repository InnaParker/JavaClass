package com.class32;

import java.util.HashSet;
import java.util.Set;

public class Repl158 {

	public static void main(String[] args) {
		/* Convert HasSet to Array. Add values as: first  second  third
		 * fourth  fifth. Output:  HashSEt contains: [third, fifth, fourth,
		 * first, second[ Array elements: third fifth fourth first second
		 */
		
		Set<String> hset=new HashSet<>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		
		System.out.println("HashSet contains:" +hset);
		
		Object[] array=hset.toArray();
		
		for(int i=0; i<array.length; i++) {
			
		}
		System.out.print("Array elements: third fifth fourth first second");
	}

}
