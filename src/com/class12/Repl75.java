package com.class12;

import java.util.Scanner;

public class Repl75 {

	public static void main(String[] args) {
		
		/* If browser is ChRoME it should print - "Proceed with chrome Browser"
		 * If browser is FireFOX it should print - "Proceed with firefox Browser"
		 * If browser is Ie it should print - "Proceed with ie Browser"
		 * If any other browser it should print - "Invalid Browser"
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		
		String browser=sc.nextLine();
	
		if (browser.equalsIgnoreCase("ChRoME")) {
			System.out.println("Proceed with chrome Browser");
			
		}else if (browser.equalsIgnoreCase("FireFOX")) {
			System.out.println("Proceed with firefox Browser");
			
		}else if (browser.equalsIgnoreCase("Ie")) {
			System.out.println("Proceed with ie Browser");
			
		}else {
			System.out.println("Invalid Browser");
		}
				
		
		
		

	}

}
