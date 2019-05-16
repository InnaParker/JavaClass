package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		/* we have 7 days in a week
		 * if day is 1-5 it is a weekday
		 * if day is 6-7 it is a weekend
		 * otherwise - not valid day of the week
		 */

		int day=5;
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
	
	}else if (day==6 || day==7) {
		System.out.println("It is a weekend");
		
	}else {
		System.out.println("Not a valid day");
		
	}


	}

}
