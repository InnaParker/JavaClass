package com.class03;

public class HomeworkNestedStatement {

	public static void main(String[] args) {
		
		int age=60;
		
		if (age < 50) {
			System.out.println("You are young");
			
		}else{
			System.out.println("You are old");
			
			if (age > 75) {
				System.out.println("You are really old!");
				
			}else {
				System.out.println("Don't worry about your age");
			}
		}
		;

	}

}
