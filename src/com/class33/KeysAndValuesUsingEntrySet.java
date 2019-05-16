package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeysAndValuesUsingEntrySet {

	public static void main(String[] args) {
		// Create a map to store userDetails(name, salary, department, title)
		
		Map<String, String> userDetailsMap=new HashMap<>();
		userDetailsMap.put("Name", "Alex Smith");
		userDetailsMap.put("Salary", "90,000");
		userDetailsMap.put("Department", "IT");
		userDetailsMap.put("Title", "Automation Tester");
		
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();  //returns a set of entries
		
		for(Map.Entry entry:userDetailsMap.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry1=it.next();
			
		}
		System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
