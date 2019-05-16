package com.class30;

import java.util.ArrayList;

public class Repl148 {

	public static void main(String[] args) {
		/*
		 * Create the arraylist with list of integers add the below numbers for the
		 * list: 111 111 111 999 999 999. Print the list using enhanced loop.
		 */

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(111);
		numbers.add(111);
		numbers.add(111);
		numbers.add(999);
		numbers.add(999);
		numbers.add(999);

		for (Integer num : numbers) {
			System.out.println(num);
		}
	}
}
