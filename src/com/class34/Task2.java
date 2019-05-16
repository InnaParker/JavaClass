package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program to check which employee gets highest salary use hashmap
		 * employee name as key and salary amount as the value. Output example: John
		 * Smith=100000.
		 */

		Map<String, Integer> salary = new HashMap<>();

		salary.put("John Smith", 100000);
		salary.put("Brad Pitt", 2000000);
		salary.put("Angela Green", 120000);
		salary.put("David Black", 70000);
		
		int max = 0;
		String key=null;
		
		for (Map.Entry<String, Integer> entry:salary.entrySet()) {
			if (entry.getValue()>max) {
				max=entry.getValue();
				key=entry.getKey();
			}
		} 
			System.out.println(max+" belongs to "+key);

		//for (Integer entry : salary.values()) {
		//	if (entry > max) {
		//		max = entry;
		//	}
		//}
		//for (Map.Entry<String, Integer> entry : salary.entrySet()) {
		//	if (entry.getValue() == max) {
		//		System.out.println(entry.getKey() + " " + entry.getValue());
		//	}
		//}
		
		
	}

}
