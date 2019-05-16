package com.class04;

import java.util.Scanner;

public class Repl22 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter First Name");
		String name=input.nextLine();
		
		System.out.println("Please enter Surname");
		String surname=input.nextLine();
		
		System.out.println(name+ " " +surname);

		
	}

}
