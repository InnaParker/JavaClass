package com.class04;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		
		/* Create a Java program that will ask user to input city and temperature.
		 * your program should convert F to C and print "The temperature is the.. in "
		 */
		
		String cityName;
		int temp;
		
		Scanner myScanner= new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter temperature in Fahrenheit");
		
		temp=myScanner.nextInt();
		
		int convertTemp=(temp-32)*5/9;
		
		
		System.out.println("The temperature in " +cityName+ " is " +convertTemp+ " C");
		
		
	}
}
