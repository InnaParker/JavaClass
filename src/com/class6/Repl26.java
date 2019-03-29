package com.class6;

import java.util.Scanner;

public class Repl26 {

	public static void main(String[] args) {
		
		/*Prompt user with question: "Is it weekend?"
		* if it is not a weekend --> subject="Manual testing"
		* Otherwise --> subject="Java"
		* Output of the program should be: "Today you will be learning _" */
		
		Scanner scan=new Scanner(System.in);
		boolean weekend;
		String activity;
		
		System.out.println("Is it weekend?");
		weekend=scan.nextBoolean();
		
		if (!weekend) {
			activity="manual testing";
			
			
		}else {
			activity="Java";
			
		}System.out.println("Today you will be learning " +activity);
	}

}
