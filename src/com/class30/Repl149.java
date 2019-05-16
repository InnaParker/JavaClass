package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl149 {

	public static void main(String[] args) {
		/*
		 * Remove an element from a particular position of an ArrayList? Remove() method
		 * which takes int type as an argument is used to remove an element from a
		 * particular position of an ArrayList. remove the element at position 1. remove
		 * all elements of Array List at a time. clear() method removes all elements of
		 * array list. It will be empty after this method is executed. Add below
		 * elements to the list. 111 222 333 444 555 666.
		 */

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(111);
		numbers.add(222);
		numbers.add(333);
		numbers.add(444);
		numbers.add(555);
		numbers.add(666);
		numbers.remove(1);
		
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			
			
			
		}
		System.out.println(numbers);
	}
	
}
