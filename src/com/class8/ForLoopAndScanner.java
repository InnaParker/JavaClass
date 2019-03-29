package com.class8;

import java.util.Scanner;

public class ForLoopAndScanner {

	public static void main(String[] args) {
		
		// prompt user to enter 2 integers and compare, print the largest number
		
		Scanner scan;
		int num1, num2;
		int largest=0;
		
		for (int i=1; i<=5; i++) {
			
		scan=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		
			if (num1>num2) {
				largest=num1;
			}else if (num2>num1) {
				largest=num2;
			}else {
				System.out.println(num1+ " is equal to " +num2);
		}
		System.out.println(largest+ " is the largest");
		
		
		
		

	}

}
}

