package com.class6;

import java.util.Scanner;

public class Repl32 {

	public static void main(String[] args) {
		
		/*Write a program using the switch statement. Let us consider the scenario 
		* regarding the born baby age. First Output: "enter the age of the Child"
		* case 1: if age is 1 print as "You can Crawl"
		* case 2 : if age is 2 print as  "You can Talk"
		* case 3: If age is 3 print as "You can Dance"
		* case 4: if age is 4 print as "You can get  Trouble"
		* other than this age (1-4) it should print "I don't know how old you are" */

		Scanner scan=new Scanner(System.in);
		int age;
		String activity;
		
		System.out.println("Enter the age of the Child");
		age=scan.nextInt();
		
		switch (age) {
		
		case 1: 
			activity="You can Crawl";
			break;
			
		case 2:
			activity="You can Talk";
			break;
			
		case 3:
			activity="You can Dance";
			break;
			
		case 4:
			activity="You can get in Trouble";
			break;
			
		default:
			activity="I don't know how old you are";
			
		}
		System.out.println(activity);
	}

}
