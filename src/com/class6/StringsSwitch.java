package com.class6;

import java.util.Scanner;

public class StringsSwitch {

	public static void main(String[] args) {
		
		
		/* prompt user to enter their country
		 * specify - favorite food
		 */

		
		Scanner scan;
		String country, food;
		int a=18;
		char b='c';
		String c="Hello";
		
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA": 
			food="Burger";
			break;	
		case "Afghanistan":
			food="Palau";
			break;
		case "Russia":
			food="Pelmeni";
			break;
		case "Italy":
			food="Pasta";
			break;
		case "Turkey":
			food="Baklava";
			break;
		case "Morocco":
			food="Cuscous";
			break;
		case "Kazakhstan":
			food="Beshparmak";
			break;
		case "Pakistan":
			food="Biryani";
			break;
		default:
			food="Unknown";
				
		}
		System.out.println("Your favorite food is " +food);
	}

}
