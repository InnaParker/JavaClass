package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
		/* Create an array of countries. While retrieving all values from 
		 * an array print capital for each country. (use 2 different loops).
		 */
		
		// 1st way
		
		
		String[] country= {"USA", "Russia", "Peru"}; 
		
		for (int i=0; i<country.length; i++) {
			
		//	if (country[i]=="USA") {
		//		System.out.println("Washington");
		//	}
		//	if (country[i]=="Russia") {
		//		System.out.println("Moscow");
		//	}
		//	if (country[i]=="Peru") {
		//		System.out.println("Lima");
		//	}
		
			if (country[i].equals("USA")) {
				System.out.println("Washington");
			}else if (country[i].contentEquals("Russia")) {
				System.out.println("Moscow");
			}else if (country[i].contentEquals("Peru")) {
				System.out.println("Lima");
			}
		}
		
		// 2nd way
		
		String[] countries= {"USA", "Russia", "Peru"}; 
		
		for (String ctry:countries) {
			
			switch (ctry) {
			
			case "USA":
				System.out.println("Washington");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			case "Peru":
				System.out.println("Lima");
				break;
			}
			
		}

	}

}
