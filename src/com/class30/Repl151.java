package com.class30;

import java.util.ArrayList;

public class Repl151 {

	public static void main(String[] args) {
		/* Create Array List of Integers that contains every value of the
		 * Array List parameter repeated twice.
		 * Array is - 0,1,2,3,4,5.  Output:  0,0,1,1,2,2,3,3,4,4,5,5.
		 */
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=0; i<=5; i++) {
			num.add(i);
		}

		for (int i=0; i<num.size(); i++) {
			System.out.print(num.get(i)+" "+num.get(i)+" ");
		}
		
	}
}
