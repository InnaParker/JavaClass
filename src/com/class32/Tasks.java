package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Tasks {
	
	/* 1. Create an ArrayList of Strings and using Collections class sort the 
	 * values of that ArrayList.
	 * 2. Create an array of Strings and using Arrays class class sort the 
	 * values of that array of Strings.
	 * 3. Create a HashSet of cities and add duplicates into it. Retrieve all 
	 * values from hashset in 2 different ways. Retrieve all values in 
	 * alphabetical order. 
	 */

	public static void main(String[] args) {
	
		// 1.
		ArrayList<String> list=new ArrayList<>();
		list.add("today");
		list.add("is");
		list.add("Friday");
		
		System.out.println("Before sorting "+list);
		
		Collections.sort(list); 
		System.out.println("Collection after sorting "+list);
		
		// 2.
		
		String[] arr= {"Java", "is", "fun"};
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		
		for(String str:arr) {
			System.out.print(str+" ");
			
		// 3.
			
			HashSet<String> cities=new HashSet<>();
			cities.add("London");
			cities.add("Barcelona");
			cities.add("Lima");	
			cities.add("Istanbul");
			
			System.out.println("Printing without order "+cities);
			
			cities.add("Lima");
			cities.add("London");
			
			List<String>mylist=new ArrayList<String>(cities);
			Collections.sort(mylist);
			
			
			System.out.println("-----1st way using Array List-");
			for(String str1:cities) {	
				System.out.println(str1);
		}
			System.out.println("-----2nd way using iterator-");
			Iterator<String> iterator=cities.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			
	}	

}
}
}