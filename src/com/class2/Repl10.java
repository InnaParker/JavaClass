package com.class2;

public class Repl10 {

	public static void main(String[] args) {
		
		/* Create a java program and name it "Main".

		* Create an int variable called myNumber. Set it equal to 
		* any integer other than 0. We will refer to myNumber as the 
		* original number from now on.
		* Create an int variable called stepOne. Set it equal to the 
		* original number (myNumber) multiplied by itself.
		* Create an int variable called stepTwo. Set it equal to the 
		* previous result (stepOne) plus the original number (myNumber).
		* Create an int variable called stepThree. Set it equal to the 
		* previous result (stepTwo) divided by the original number.
		* Create an int variable called stepFour. Set it equal to the 
		* previous result (stepThree) plus 17.
		* Create an int variable called stepFive. Set it equal to the 
		* previous result (stepFour) minus the original number.
		* Create an int variable called stepSix.Set it equal to the 
		* previous result (stepFive) divided by 6.
		* Let's print out the value of the last step as: "The magic 
		* number is _ !"
		* Now try running your code! What number is printed to the console?
		* Now, go back to your code and change myNumber to any other 
		* integer. Run your program again. Is the output the same? 
		* It's math magic!   */
		
		int myNumber=5;
	    int stepOne=myNumber*myNumber;
	    int stepTwo=stepOne+myNumber;
	    int stepThree=stepTwo/myNumber;
	    int stepFour=stepThree+17;
	    int stepFive=stepFour-myNumber;
	    int stepSix=stepFive/6;
	    
	    System.out.println("The magic number is " +stepSix+ "!");
	    

	}

}
