package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		/*/* if number is between 1-10 it is small
		 * if num between 11-100 it is medium
		 * if num is between 101-1000 it is large
		 */

		int num=115;
		
		//true AND false = false
		if (num>1 && num<=10) {
			System.out.println("Number is small");
			
			//true AND true = true
		}else if (num>=11 && num<=100) {
			System.out.println("Number is medium");
			
			//false AND true = false
		}else if (num>=101 && num<=1000) {
			System.out.println("Number is large");
			
			
		}else {
			System.out.println("Numberis not in range");
		}
		
	}

	}


