package com.class10;

import java.util.Scanner;

public class Repl56 {

	public static void main(String[] args) {
		
		/*Write a program that creates an array of strings with the size being 7. 
		 * Ask the user to input Days of a week beginning with Sunday. 
		 * Add these inputs to your array and print the values using a for-each loop.
		 */

		Scanner scan=new Scanner(System.in);  //For user input
		
		String[] days=new String[7];          //Initialized array of size 7
		
		for (int i=0; i<days.length; i++){    //Used loop for user input
			System.out.println("Please enter day "+(i+1)+" of the week");
	
			  days[i]=scan.next();			  //Assigned users value to array
		}
			for (int y=0; y<days.length; y++) { //Loop to display values
				System.out.println(days[y]);
				
			}
			
	}
}
