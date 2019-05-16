package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String > names=new ArrayList<String>();
		names.add("Helen");
		names.add("Marty");
		names.add("Jacob");
		names.add("Ann");
		
		// First way - using For loop
		
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
			
		}
		System.out.println("_____________");
		
		// Second way - using Advance For loop
		
		for (Object name:names) {
			System.out.println(name);
		}
		
		// Third way - using iterator. Will return 1 iterator object.
		
		Iterator<String> it=names.iterator();
		//boolean check=it.hasNext();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
