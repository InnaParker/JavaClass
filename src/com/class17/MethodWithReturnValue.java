package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
		
		int stringLength=str.length(); //string length=5
		System.out.println(stringLength);
		
		char character = str.charAt(1);
		System.out.println(character);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		String day=obj.whatIsDay();
		System.out.println("Today is "+day);
		
		//int num=obj.findLargestNum(20, 10);
				int largestNum=obj.findLargestNum1(20, 10);
				
				boolean isOdd;
				
				if(largestNum%2==0) {
					isOdd=false;
				}else {
					isOdd=true;
				}
				
				System.out.println(isOdd);
				
				
			}

	void askHowAreYou(String name) { //parameter in ()
		System.out.println("How are you "+name);
	}
	String whatIsDay () {
		System.out.println("I am inside a method");
		return "Thursday";
	}
	void findLargestNum(int a, int b) {

		if (a < b) {
			System.out.println("A is largar than B");
		} else {
			System.out.println("B is largar than A");
		}
	}
	int findLargestNum1(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}

}
}
