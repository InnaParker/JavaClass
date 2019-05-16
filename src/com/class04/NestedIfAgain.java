package com.class04;

public class NestedIfAgain {

	/*declare variable for gpa and having a diploma
	 * if user has diploma - congrats. If GPA is higher
	 * than 3.5 - hire person. Else - don't hire*/
	 
	public static void main(String[] args) {
		
		double gpa=4.0;
		double expectedGpa=3.7;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations!");
			
			if (gpa>expectedGpa ) {
				System.out.println("You are hired");
				
			}else {
				System.out.println("We cannot hire you");
			}
			
		}else {
			System.out.println("Please get your degree");
			
			
		}
		
		
	}
}
