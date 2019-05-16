package com.class30;

import java.util.ArrayList;

public class Task1 {
	
	/* Create a generic ArrayList that will store 5 names into it. Find out whether 
	 * the given ArrayList is empty or not? Check whether the specific name is 
	 * present in an ArrayList or not? Find the size of your arrayList and print all 
	 * values from that.
	 */

	public static void main(String[] args) {
		
		// Generic array, that stores only String Object
		
		ArrayList<String > names=new ArrayList<String>();
		names.add("Helen");
		names.add("Marty");
		names.add("Jacob");
		names.add("Ann");
		names.add("George");
		
		//names.add(123); not valid since we have generic array list.
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Valery"));
		System.out.println(names.size());
		
		for(String str: names) {
			System.out.println(str);
		}
		
		// Non-generic array list - can store different types of objects.
		
		ArrayList alist=new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(120.23);
		alist.add(true);
		alist.add('A');
		
		for(Object values:alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanList=new ArrayList<Boolean>();
		booleanList.add(true);
		booleanList.add(false);
		
	}

}
