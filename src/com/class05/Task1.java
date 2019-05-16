package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/* prompt the user to enter persons height in feet.
		 * - short under 5 feet
		 * - medium 5-6 feet
		 * - tall 6 feet and over */

		Scanner input=new Scanner(System.in);
		
		
			System.out.println("Please enter your height in feet");
			double height=input.nextDouble();
			
				System.out.println("You are medium");
				
			 if (height<5) {
				System.out.println("You are short");
				
			}else if (height >=6) {
				System.out.println("You are tall");
			}else {
				System.out.println("Please enter valid height");
			}
				

	}

}
