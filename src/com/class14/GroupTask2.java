package com.class14;

public class GroupTask2 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to find the 2nd largest number in the array.
		 * Maximum and minimum number in the array?
		 */

		int[] array = { 5, 12, 15, 43, 23 };

		
		int max = Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;

		for (int num: array) {

			if (num > max) {
				secondLargest=max;
				max=num;
			}

		}
		System.out.println("Second largest number is: "+secondLargest);
		System.out.println("Maximum number is: "+max);

		
	}
}
