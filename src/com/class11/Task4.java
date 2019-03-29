package com.class11;

public class Task4 {

	public static void main(String[] args) {
		
		// Create array of integers and find the largest number - Interview Q!
		
		int[] numbers= {1,2,3,4,5};
		int max=numbers[0];
		int min=numbers[0];
		
		for (int num:numbers) {  //for (int i=0; i<numbers.length; i++) {
			
			
			if (num>max) {       //if (numbers[i]>max) {
				max=num;
				
			}else if (num<min) {
				min=num;
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);

	}

}
