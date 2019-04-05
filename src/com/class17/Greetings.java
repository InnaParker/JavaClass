package com.class17;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj=new Greetings();
		obj.hello();
		
		obj.findLargest(20, 10);//calling method find largest and passing values
		obj.findLargest(30, 31);
		
		obj.helloToInstructor("Weqas");
		obj.helloToInstructor("Arif");
				

	}
	void hello () {
		System.out.println("Hello");
	}
	void helloToInstructor(String name) { //method with 1 parameter
		System.out.println("Hello "+name);
	}
	
	
	void findLargest(int a, int b) {
		
		if (a>b) {
			System.out.println("A is larger than B"); //method with 2 parameters
		}else {
			System.out.println("B is larger than A");
		}
	}

}
