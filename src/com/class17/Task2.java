package com.class17;

public class Task2 {

	public static void main(String[] args) {
		
		// Create a method that will take a number and prints whether 
		// the number is even or odd.

		Task2 number=new Task2();
		number.evenOROdd(5);
		
	}
	void evenOROdd (int a) {
		
		if (a%2==0) {
			System.out.println(a+ " is even number");
		}else {
			System.out.println(a+" is an odd number");
		}
	}

}
