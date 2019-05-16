package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repl162 {

	public static void main(String[] args) {
		/* Create HashMap with String and Integer.Print only the key values by using 
		 * the Enhanced for loop add values like ("ONE",1); Output:
		 * FIVE   ONE FOUR TWO THREE 
		 */
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("FIVE", 5);
		map.put("ONE", 1);
		map.put("FOUR", 4);
		map.put("TWO", 2);
		map.put("THREE", 3);
		
		Collection<String> valCol=map.keySet();
	
		for (String value: valCol) {
			System.out.print(value+" ");
			
		}
	}

}
