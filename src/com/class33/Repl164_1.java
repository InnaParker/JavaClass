package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repl164_1 {

	public static void main(String[] args) {
		/* How do you check whether a particular key/value exist in a HashMap.
		 * Add the below values: 1  1.1   2 2.2  3 3.3  4 4.4  5 5.5
		 * Check if key 3 is there? Value 4.4 is there? And key 6?
		 * Output: true true false  */

		Map<Integer, Double> map=new HashMap<>();
		
		map.put(1, 1.1);
		map.put(2, 2.2);
		map.put(3, 3.3);
		map.put(4, 4.4);
		map.put(5, 5.5);
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(4.4));
		System.out.println(map.containsKey(6));
		
	//	Set<Integer>key=map.keySet();
	//	for(Integer y:key) {
	//		if (y==3) {
	//			System.out.println(true);
	//		}
	//	}
	//	Collection<Double> value=map.values();
	//	for(Double y:value) {
	//		if(y==4.4) {
	//			System.out.println(true);
	//		}
	//	}
	//	for(Integer y:key) {
	//		if(y>=5) {
	//			if(y==6) {
	//				System.out.println(true);
	//			} else {
	//				System.out.println(false);
	//			}
	//		}
		}
	}
	


