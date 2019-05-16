package com.class06;

import java.util.Scanner;

public class Repl30 {

	public static void main(String[] args) {
		
		/*Take 2 boolean inputs from a user: "Are you thirsty?" "Are you sleepy?"
		* If user is thirsty and not sleepy--> drink=Water
		* If user is thirsty and sleepy--> drink=Coffee
		* If user is not thirsty and sleepy --> drink=Tea
		* Otherwise drink="Nothing"
		* The output should be:   "Looks like you need ___ " */

		Scanner scan=new Scanner(System.in);
		boolean a=true;
		boolean b=true;
		String drink="";
		
		System.out.println("Are you thirsty?");
		a=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		b=scan.nextBoolean();
		
		if (a && b) {
			drink="Coffee";
		}else if (a && (!b)) {
			drink="Water";
		}else if ((!a) && b) {
			drink="Tea";
			
		}else {
			drink="Nothing";
			
		}System.out.println("Looks like you need " +drink);
	} 
	
	
}
