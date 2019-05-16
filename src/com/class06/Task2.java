package com.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/* ask user to enter their country and capture it.
		 * once values are captured print which language user speaks.
		 */

		Scanner scan;
		String country, lang;
		
		scan=new Scanner(System.in);
		 
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA": 
			lang="English";
			break;	
		case "Mexico":
			lang="Spanish";
			break;
		case "Russia":
			lang="Russian";
			break;
		case "Italy":
			lang="Italian";
			break;
		default:
			lang="Unknown";
			
			
		}
		System.out.println("Your lanuage is " +lang);
	}

		
		
	}


