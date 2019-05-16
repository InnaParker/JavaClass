package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/* write a program that prints out - if it is good weather to go for activity or not.
		 * 
		 * if temp outside is between 40-80 degrees inclusive with no rain - go hiking,
		 * otherwise do not go hiking. 
		 * if temp between 25-40 inclusive & snowing - go snowboarding, otherwise not go. 
		 * if temp is more then 80 and sunny - go to the beach, otherwise do not go.
		 */
		
		Scanner scan;
		
		boolean snow, rain, sunny;
		int temp;
		String activity;  //or String activity=""; or null
		
		scan=new Scanner(System.in);
		
		System.out.println("What is the temperature outside");
		temp=scan.nextInt();
		
		
		if (temp>=40 && temp<80) {
			System.out.println("Is it raining outside?");
			rain=scan.nextBoolean();
			
			if (rain) {
				activity="Will watch movie";
				
			}else {
				activity="Go hiking";
			}
				
		}else if (temp>=25 && temp<40) {
				System.out.println("Is it snowing outside?");
				snow=scan.nextBoolean();
				
			if (snow) {
				activity="Will go snowboarding";
				
			}else {
				activity="Will do coding";
			}
			
		}else if (temp>=80) {
				System.out.println("Is it sunny outside?");
				sunny=scan.nextBoolean();
				
			if (sunny) {
				activity="Go to the beach";
				
			}else {
				activity="Will do more coding";
			}
				
		}else {
			System.out.println("Please enter different temperature");
			activity="Unknown";
			
		}
		
		System.out.println("My activity is " +activity);
	}
}
