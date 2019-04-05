package com.class17;

public class NoMainMethod {
	
	String str;
	int num;
	
	void hello () {
		System.out.println("Hello");
		System.out.println("Java");
		
	}
	void bye () {
		System.out.println("Bye");
	}
	public static void main(String[] args) { //method signature
		
		NoMainMethod obj=new NoMainMethod();  //method body - can have many lines
		obj.hello();							//calling method Hello
		obj.bye();
	}

}
