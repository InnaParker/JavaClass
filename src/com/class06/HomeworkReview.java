package com.class06;

import java.util.Scanner;

public class HomeworkReview {

	public static void main(String[] args) {
		
		int num1; int num2; int num3, largest;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1>num2) {
			
			if (num1>num3) {	
				largest=num1;
				
			} else {
				largest=num3;
				
			}
		
						
		}else { //assuming num2>num1
				
			if (num2>num3) {
				largest=num2;
							
			}else {
				largest=num3;
				
					
					
				}
		}	System.out.println(largest+ " is the largest number");

	}

}
