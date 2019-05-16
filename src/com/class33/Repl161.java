package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl161 {

	public static void main(String[] args) {
		/* Create HashMap with String and Integer and print the values 
		 * directly. Output:  {FIVE=5, ONE=1, FOUR=4, TWO=2, THREE=3}
		 */

		Map<String, Integer> map=new HashMap<>();
		
		map.put("FIVE", 5);
		map.put("ONE", 1);
		map.put("FOUR", 4);
		map.put("TWO", 2);
		map.put("THREE", 3);
		
		System.out.println(map);
	}

}
