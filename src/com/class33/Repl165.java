package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Repl165 {

	public static void main(String[] args) {
		/* How to replace a value associated with given key in HasMap?
		 * Add following values: map.put("ONE","AAA");  map.put("TWO","BBB");
		 * map.put("THREE","CCC"); map.put("FOUR","DDD"); map.put("FIVE","EEE");
		 * Print key and value pairs. Replace with below key THREE -> ASEL
		 * and key FIVE -> SUMAIR. Print values after replacing.
		 */

		Map<String, String> map = new HashMap<>();
		
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
	 
	 System.out.println("HashMap Before Replace :");
	 for (Map.Entry<String, String> entry: map.entrySet()) {
		 
		 System.out.println(entry.getKey()+":"+entry.getValue());
	 }
	 
	 System.out.println("------------------");
	 System.out.println("HasMap After Replace :");
	 
	 map.replace("THREE", "ASEL");
	 map.replace("FIVE", "SUMAIR");
	 for (Map.Entry<String, String>entry: map.entrySet()) {
		 System.out.println(entry.getKey()+":"+entry.getValue());
	 }
	}

}
