package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl166 {

	public static void main(String[] args) {
	/* Create hashmap with key and value pairs. Add values as below:
	* map.put("mango", 10); map.put("apple", 30); map.put("orange", 20);
	* Create the method to check if it is empty or not. If it's not empty, 
	* print the values. Call the method in the method to check if map
	* is empty or not and clear the values.  map.clear(); Call the method
	* again to check if it is empty or not. It should print map is empty. 
	* Output: {orange=20, apple=30, mango=10}. map is empty. */

		Map<String, Integer> map = new HashMap<>();
		
		map.put("mango",10);
		map.put("apple",30);
		map.put("orange",20);
		
		if (map.isEmpty()) {
			
		} else {
			System.out.println(map);
		}
		
		map.clear();
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}
	}
}
