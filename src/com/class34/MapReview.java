package com.class34;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {

	public static void main(String[] args) {
		// Create map of groceries with quantity
		
		Map<String, Integer> groceryMap=new LinkedHashMap<>();
		
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Potato", 2);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Cookies", 3);
		
		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap);
		
		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap.size());
		
		groceryMap.remove("Cheese");
		System.out.println(groceryMap);
		
		//Retrieve all keys+values using keySet()
		Set<String> keySet=groceryMap.keySet();
		for (String key: keySet) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		// Using iterator
		Iterator<String> keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
			}
		
		for (String key: groceryMap.keySet()) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));	
		}
		
		// if don't want to store variable in keySet
		Iterator<String> keyIt1=groceryMap.keySet().iterator();
		while(keyIt1.hasNext()) {
			String key=keyIt1.next();
			System.out.println(key+":"+groceryMap.get(key));
			}
		// Retrieve all values 
		Collection<Integer> valCollection=groceryMap.values();  //1st way create var
		for (Integer value:valCollection) {
			System.out.println(value);
		}
		
		for (Integer value1:groceryMap.values()) { //2nd way not creating variable
			//System.out.println(value);
		}
		
		Iterator <Integer> valueIt=groceryMap.values().iterator();
		while (valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		// Retrieve all values using entrySet()
		//Set<Map.Entry<String, Integer>> setOfEntries=groceryMap.entrySet();
		
		for (Map.Entry<String, Integer> entry:groceryMap.entrySet()) {
			String mapValue=entry.getKey()+" "+entry.getValue();
			System.out.println(mapValue);
		}
		
		// Map -> using entrySet will get -> Set -> any collecting has Iterator method
		Iterator<Map.Entry<String, Integer>> it=groceryMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String valueFromMap=entry.getKey()+" and "+entry.getValue();
			System.out.println(valueFromMap);
		}
		
	}

}
