package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer1=new Integer(10); // Boxing - converting primitive to object
		System.out.println(integer1);

		Integer integer2=20;   		// Autoboxing
		
		int num=integer1.intValue();// Unboxing
		System.out.println(num);
		
		int num2=integer2; 			// Auto unboxing
		
		
		
	}

}
