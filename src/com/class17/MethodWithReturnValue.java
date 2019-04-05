package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
		
		int stringLength=str.length(); //string length=5
		System.out.println(stringLength);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		String day=obj.whatIsDay();
		

	}
	void askHowAreYou(String name) { //parameter
		System.out.println("How are you "+name);
	}
	String whatIsDay () {
		System.out.println("I am inside a method");
		return "Thursday";
	}

}
