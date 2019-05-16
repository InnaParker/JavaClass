package com.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* allow user to enter grade and then provide explanation:
		 * A-excellent; B-good; C-average; D-bad; any other - Not Acceptable
		 * at the end should print which grade was entered with explanation.
		 */

		
		Scanner scan;
		String grade;
		String description;
		//using char grade;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		grade=scan.nextLine(); //grade=scanner.next().charAt(0);
		
		switch (grade) {
		
		case "A":   //case 'A':
			description="Excellent";
			break;	
		case "B":
			description="Good";
			break;
		case "C":
			description="Average";
			break;
		case "D":
			description="Bad";
			break;
		default:
			description="Not acceptable";
	}
		System.out.println(grade+ " is " +description);
} }

