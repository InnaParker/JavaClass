package com.class09;

import java.util.Scanner;

public class InClassTask5DoWhile {

	public static void main(String[] args) {
		
		Scanner scan;
		int secret, userNumber;
		secret=13;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Enter number from 1 to 20");
			userNumber=scan.nextInt();
			
			if (userNumber>secret) {
				System.out.println("Number is too small");
				
			}else {
				System.out.println("Number is too big");
				
			}
		} while (secret!=userNumber);
		
		System.out.println("You got it");
		
		
		

	}

}
