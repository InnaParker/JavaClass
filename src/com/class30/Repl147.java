package com.class30;

import java.util.ArrayList;

public class Repl147 {

	public static void main(String[] args) {
		/* Retrieve an element from a particular position of array list.
		 * get() method returns an element from a specified position of
		 * array list. This method takes index of element as an argument.
		 * Add 6 elements to the list: 111 222 333 444 555 666.
		 * By using get method call get 1,3,5.  */
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(111);
		numbers.add(222);
		numbers.add(333);
		numbers.add(444);
		numbers.add(555);
		numbers.add(666);
		
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(3));
		System.out.println(numbers.get(5));
	}

}
