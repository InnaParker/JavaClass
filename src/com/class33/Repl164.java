package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl164 {

	public static void main(String[] args) {
		/* How do you remove a key-value pair from a HashMap if the specified key is 
		 * currently mapped to given value? Another version of remove() method which 
		 * takes two arguments – one is key and another one is value, removes the 
		 * mapping for the specified key only if it is currently 
		 * mapped to given value. Add following values:
		 * map.put("ONE","AAA");    map.put("TWO","BBB");  map.put("THREE","CCC");
		 * map.put("FOUR","DDD");   map.put("FIVE","EEE");
		 * Print the Key and Values pairs. Remove "One", "AAA",  "Four", "DDD",
		 * Print the values.
		 */

		Map<String, String> map = new HashMap<>();
		
			map.put("ONE","AAA");
			map.put("TWO","BBB");
			map.put("THREE","CCC");
			map.put("FOUR","DDD");
			map.put("FIVE","EEE");
		 
		 System.out.println("HashMap Before Remove :");
		 for (Map.Entry<String, String> entry: map.entrySet()) {
			 
			 System.out.println(entry.getKey()+":"+entry.getValue());
		 }
		 
		 System.out.println("------------------");
		 System.out.println("HasMap After Remove :");
		
		 map.remove("ONE", "AAA");
		 map.remove("FOUR", "DDD");
		 for (Map.Entry<String, String>entry: map.entrySet()) {
			 System.out.println(entry.getKey()+":"+entry.getValue());
		 }
	}

}
