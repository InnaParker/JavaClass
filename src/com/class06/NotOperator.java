package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		// NOT operator ! = reverses condition
		
		boolean a=!true;
		
		System.out.println("The value of boolean is " +a);
		
		boolean snow=true;
		
		//if not snowing - will come to the class otherwise - stay at home
		
		if (!snow) {
			System.out.println("Will stay home");
		}
		
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("X is larger than Y");
		}
	
	//if numbers are not equal statement
	//if (!(num1==num2 && num1==num3 && num2==num3));
}

}

