package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
		int a=10; //Primitive variables store only 1 value
		int b=20;
		
		int[] array= {10,10,20,20}; // Array is fixed in size
		
		ArrayList <Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);	// Comes from collecting, must import from util
		numbers.add(0, 13);	// specific to all list objects
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		
		System.out.println(numbers.contains(33));
		
		// 1st way to retrieve all values using for loop
		
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		// 2nd way using advanced for loop
			
		for(int Object: numbers) {
			System.out.println(Object);
		}
				
		// 3rd way using iterator
				
		Iterator <Integer> it=numbers.iterator();	
		// Methods inside iterator: hasNext(); next(); remove();
		
		while(it.hasNext()) {
			int number= it.next();
			System.out.println(number);
		}
		
		// 4th way using while loop
		int c=0;
		while (numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
			}
				
	}}
		
		
	}


