package com.class18;

public class Repl95 {
	
	/* Write a method header on line two with following specs:
	 * Returns: a String. Method Name: makeThreeSubstr
	 * Parameters: a String called "word", an integer called "startIndex"
	 * an integer called "endIndex"
	 * Then, starting on line 4, write code that will return 3x the substring
	 * (no spaces) from "startIndex" to "endIndex"
	 * Examples:
	 * makeThreeSubstr("hello",0,2) ==> "hehehe"
	 * makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"
	 */

	static String makeThreeSubstr (String word, int startIndex, int endIndex) {
		
		String str="";
		for (int i=startIndex; i<endIndex; i++) {
			str=str+word.charAt(i);
		}
		return str+str+str;
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		Repl95 obj=new Repl95();
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}
