package com.class02;

public class Repl09 {

	public static void main(String[] args) {
		
		/* Add num1 and num2. Divide the result by num3.
		 * Subtract num4 from that result. Then, output your answer 
		 * in the following format "The result of arithmetic operations 
		 * is equal to ___" */
		
		int num1 = 3;
	    int num2 = 7;
	    int num3 = 5;
	    int num4 = 1;
	    
	    //start coding here
	    int sum=num1+num2;
	    int div=sum/num3;
	    int sub=div-num4;
	    
	    
	    System.out.println("The result of arithmetic operations is equal to " +sub);

	}

}
