package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl168 {

	public static void main(String[] args) {
		/* Create hashmap with key and values pairs, add values as below. Make sure 
		 * you insert map.put in the same order as below:
       	 * map.put("mango", 10); 
       	 * map.put("apple", 30); 
       	 * map.put("orange", 20); 
       	 * map.put("banana", 30); 
       	 * map.put("grapes", 20);
		 * Output: {orange=20, banana=30, apple=30, mango=10, grapes=20}  */

		Map<String, Integer> map = new HashMap<>();
		
		map.put("mango",10);
		map.put("apple",30);
		map.put("orange",20);
		map.put("banana",30);
		map.put("grapes",20);
		
		System.out.println(map);
	}

}
