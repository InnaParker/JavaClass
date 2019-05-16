package com.class08;

public class BreakInLoops {

	public static void main(String[] args) {
		// 
		
		for (int i=1; i<=10; i++) {
			
			if (i==5) {
				break; //will take you out completely out of the loop
				
			}
			System.out.println(i);
		}
		for (int g=0; g<=4; g++) {
			System.out.println("Hello");
			break;
			
		}
		
	}

}
