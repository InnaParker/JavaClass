package com.class8;

public class ContinueWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<5; i++) {
			
			if (i==2 || i==3) { //if this condition is true will skip line 14 and go to 10
				continue;
				
			}
			System.out.println(i);
			
		}
		
		//print numbers from 1 to 20 but skip the ones that can be divided by 3
		
		for (int a=1; a<=20; a++) {
			if (a%3==0) {
				continue;
				
			}
			System.out.println(a);
		}
	}

}
