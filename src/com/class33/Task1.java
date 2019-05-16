package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// Remove duplicate names from ArrayList
		
		List<String> list=new ArrayList<String>();
		list.add("John");
		list.add("Jane");
		list.add("James");
		list.add("Jasmine");
		list.add("Jane");
		list.add("James");
		
		System.out.println(list);
		
		HashSet<String> list1=new HashSet<>(list);
		System.out.println(list1);

	}

}
