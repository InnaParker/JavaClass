package com.reviews;

import java.util.Scanner;

public class Session2 {

	public static void main(String[] args) {
		
		//write a program to find out what time of the day it is
		/*
		int time=0701;
		
		
		if (time<=0700) {
			System.out.println("Good morning");
			
			
		} else if (time<=1205){
			
			System.out.println("Good day");
			
		}else { 
			System.out.println("Good evening");*/
		
		
		
		
		
		//create boolean value for summer and sunny. 
		//As a family we go on vacation only in the summer.
		
		/*boolean summer=true;
		boolean sunny=true;
		
		
		if (summer==true) {
			
			if (sunny==true) {
				
				System.out.println("We go to the beach");
				
			}else {
				System.out.println("We do not go to the beach");
			}
			
			
		
		} else {
			System.out.println("It is not the summer");
			
		} */
		
		
		
		//find out persons name, gender, age, mobile number
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		
		String name=input.nextLine();
		
		System.out.println("Enter your gender");
		
		String gender=input.nextLine();
		
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Enter your mobile phone");
		
		long phone=input.nextLong();
		
		
		System.out.println("Name:" +name);
		
		System.out.println("Gender:" +gender);
		
		System.out.println("Age:" +age);
		
		System.out.println("Mobile phone:");
		
		
		
		
		
		
	}

}
