package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValueFromSet {

	public static void main(String[] args) {
		
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		
		// 1st way convert to ArrayList 
		// a- add collection to Array List
		
		List<String> list=new ArrayList<>(cars);
		System.out.println("List collection: "+list);
		System.out.println(list.get(2));
		
		// b- 
		List<String> list2=new ArrayList<>();
		list2.addAll(cars);
		System.out.println("List2 collection: "+list2);
		
		// 2nd way - convert to Array
		Object[] array=cars.toArray();
		System.out.println(array[1]);
	}

}
