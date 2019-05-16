package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllKeysAndValuesForMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(4, "C");
		map.put(5, "D");
		
		System.out.println(map);
		
		// Return Set of keys from the map
		
		Set<Integer> keys=map.keySet();
		
		// How to print all keys?
		
		System.out.println();
		System.out.println("Using for each loop-------");
		for (Integer key: keys) {
			System.out.print(key+" ");
		}
		
		System.out.println();
		System.out.println("Using iterator------------");
		Iterator<Integer> keysIt=keys.iterator();
		while (keysIt.hasNext()) {
			Integer key=keysIt.next();
			System.out.print(key+":"+map.get(key));
		}
		
		// How to get All Values - returns collection of values from the Map
		Collection<String> valCol=map.values();
		System.out.println("Using for each loop--------");
		for (String value: valCol) {
			System.out.print(value+" ");
			
		}
		System.out.println();
		System.out.println("Using iterator------------");
		
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+" ");
		}
	}

}
