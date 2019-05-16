package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		// Map<Key, Value>
		
		Map<Integer, String> map=new HashMap<>();
		
		// Add entries (key+values)
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		// Retrieve values
		System.out.println(map.get(102));
		
		// how to find size of Map
		
		System.out.println(map.size());
		
		// To update value
		
		System.out.println(map.replace(103, "Bilal"));
		System.out.println(map.get(103));
		
		// How to remove
		System.out.println(map.remove(104));
		System.out.println(map.size());
		
		// How to check if there is any values in the map
		System.out.println(map.isEmpty());
		
		System.out.println(map);
		
		// To check if specific key/value is there
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Kate"));
		
		map.put(105, "Jane");
		System.out.println(map);
		
		map.put(101, "Rory");
		System.out.println(map);
		map.put(null, "Some value");
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
	}

}
