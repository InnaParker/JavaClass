package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
	//	int a=10;
	//	int b=0;
		
	//	System.out.println(a/b);  // automatically created object - ArithmeticException

		// If person is >18 issue DL, else - throw exception
		//checkAgeEligibility(17);
		//twoNumDiv(10,0);
		checkUserNameLength("A");
		
	}
	
	public static void checkAgeEligibility (int age) {
		
		if(age>=18) {
			System.out.println("You can receive drivers license");
		} else {
			throw new ArithmeticException("You are not eligible for drivers license");
			
		}
	}
	
	public static void twoNumDiv(int a, int b)
	{
		if(b!=0) {
			System.out.println(a/b);
		} else {
			throw new ArithmeticException("We cannot divide by 0");
		}
	}
	
	public static void checkUserNameLength(String userName)
	{
		if(userName.length()>3) {
			System.out.println("User name is valid");
		} else {
			throw new NullPointerException("User name must be longer that 3 char");
		}

}
}
