package com.class18;

public class Repl93 {
	
	/* Write a method header on line two with the following specs:  
	 * Returns: a char. Method Name: getChar. 
	 * Parameters: a String called "word". an integer called "index"
	 * Then, starting on line 4, write code that will return the character
	 * in "word" at the index "index".
	 * Examples: getChar("hello",1) ==> 'e' */

	public static char getChar(String word, int index) {
		
		for (int i=0; i>=word.length(); i++) {
			word.charAt(i);	
		}
		return word.charAt(index);
	}
	
	public static void main(String[] args){
		
		System.out.println(getChar("hello",1));

}
}
