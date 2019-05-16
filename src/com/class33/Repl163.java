package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Repl163 {

	public static void main(String[] args) {
		/* Add the following values to the Map.
		* map.put("Shiva",222);
		* map.put("Sandish",333);
		* map.put("Asel",555);
		* map.put("Sumair",666);
		* Print all keys using iterator. */

		Map<String, Integer> map=new HashMap<>();
		
		map.put("Shiva",222);
		map.put("Sandish",333);
		map.put("Asel",555);
		map.put("Sumair",666);
		
		Set<String> keys=map.keySet();
		
		Iterator<String> keysIt=keys.iterator();
		while (keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.print(key+" ");
		}
		
	}

}
