package com.class11;

public class Task3 {

	public static void main(String[] args) {
		
		
		/* Create an array on integers and calculate the sum 
		 * of all elements in an array.
		 */

		int[] numbers= {1,2,3,4,5};
		
		int total=0;
		
		for (int i=0; i<numbers.length; i++) {
			total+=numbers[i];
			
		}
		System.out.println(total);
	}

}
