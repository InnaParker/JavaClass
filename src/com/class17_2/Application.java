package com.class17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {

		// Call methods from Calculator class com.class 17

		Calculator operations = new Calculator();

		int x = 10, y = 100;

		int d = operations.mult(x, y);

	//	System.out.println(d);
		
		Application app=new Application();
		System.out.println(app.example5('1'));

	}

	// Types of methods

	void example1() {
		System.out.println("No return value and no parameters");
	}

	void example2(String name) {
		System.out.println("No return value with parameter " + name);
	}

	boolean example3() {
		System.out.println("With return value and no parameters");
		// return true; (void and return do not go together)
		return true;

	}

	String example4(String name) {
		System.out.println("With return value and with parameters");
		return name;

	}
	char example5(char name) {
		System.out.println("With return value and with parameters");
		return name;
}
}
