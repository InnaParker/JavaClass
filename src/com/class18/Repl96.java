package com.class18;

public class Repl96 {
	
	/* Write a method header on line 2 with following specs:
	 * Returns: String, Method Name - mixString, Parameters: String s1 and s2
	 * Starting on line 4, write code that will return the strings combined, 
	 * one letter at a time, starting with s1.  See example below for an example.  
	 * You can assume that s1 and s2 are equal lengths:
	 * s1 ==> "12345"
	 * s2 ==> "abcde"
	 * mixString(s1,s2) ==> "1a2b3c4d5e"
	 */
	
	static String mixString(String s1, String s2) {
		
		String str="";
		
		for (int i=0; i<s1.length(); i++) {
			str=str+(s1.substring(i, i+1)+s2.substring(i, i+1));
		}
		return str;	
	}
	
	
	//test case below (dont change):
	public static void main(String[] args){
		
		Repl96 obj=new Repl96();
		
		System.out.println(Repl96.mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(Repl96.mixString("howdy","hello")); //should be hhoewldlyo
	}

}
