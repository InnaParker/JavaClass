package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl167 {

	public static void main(String[] args) {
		/* Create HashMap with key and value pairs and add duplicate keys, print values.
		 * map.put("mango", 10); apple, 30, orange, 20  mango 40 mango 40
		 * Output:  {orange=50, apple=30, mango=40}   */

		Map<String, Integer> map = new HashMap<>();
		
		map.put("mango",10);
		map.put("apple",30);
		map.put("orange",50);
		map.put("mango",40);
		map.put("mango",40);
		
		System.out.println(map);
		
	}

}
