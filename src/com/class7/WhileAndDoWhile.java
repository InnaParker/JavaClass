package com.class7;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
		int a=10;
		
		do {  //executes 1st and then checks condition
			System.out.println("Hello");
			a++;
			
		}while (a>15);
		
		
		int b=10;
		
		while (b>15) {  //check condition and then executes
			System.out.println("Bye");
			b++;
		}

	}

}
