package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapFromArray {

	public static void main(String[] args) {
		
		String [] names= {"Mehmet", "Asha", "Amina", "Omar", "Danny"};

		Map<Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1;
		
		for(String name: names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
	
		// Print keys and values using entrySet() loop & Iterator
		
		for (Entry<Integer, String> entry:nameMap.entrySet()) {
			String mapValue=entry.getKey()+" "+entry.getValue();
			System.out.println(mapValue);
		}
		Iterator<String> valueIt=nameMap.values().iterator();
		while (valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
	}
}
