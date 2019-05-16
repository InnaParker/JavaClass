package com.class06;

import java.util.Scanner;

public class Repl29 {

	public static void main(String[] args) {
		
		/* Prompt user to: "Please enter your birthday month number"
		* if user enters 12, 1, 2 --> season="Winter"
		* if user enters 3, 4, 5--> season="Spring"
		* if user enters 6, 7, 8 --> season="Summer"
		* if user enters 9, 10, 11--> season="Fall"
		* if any other number--> "Please enter valid month number" and season="Unknown"
		* The output of the program should be : "You were born in __ " */
		
		Scanner scan=new Scanner(System.in);
		
		int month;
		String season="";
		
		System.out.println("Please enter your birthday month number");
		month=scan.nextInt();
		
		if (month==1 || month==2 || month==2) {
			season="Winter";
		}else if (month==3 || month==4 || month==5) {
			season="Spring";
		}else if (month==6 || month==7|| month==8) {
			season="Summer";
		}else if (month==9 || month==10 || month==11) {
			season="Fall";
		}else {
			season="Unknown";
			
		System.out.println("Please enter valid month number");
		
	}	System.out.println("You were born in " +season);
	
		

	}
}

