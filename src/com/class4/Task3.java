package com.class4;

public class Task3 {

	public static void main(String[] args) {
		
		/* Create a Java program and store variables for mortgage rate and price.
		 * first program should check if rate is higher that 4.5 user will not buy a house.
		 * Otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash. 
		 */
		
		double mortgageRate=4.3;
		int mortgagePrice=200000;
		
		
		if (mortgageRate>4.5) {
			System.out.println("I will not buy a house");
			
			
		}else {
			System.out.println("I will consider buying this house");
			
			if (mortgagePrice>=200000) {
				System.out.println("I will take a loan");
				
			}else {
				System.out.println("I will pay cash");
				
			}
		}
		
		
	}
}
