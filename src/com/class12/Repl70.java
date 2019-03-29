package com.class12;

public class Repl70 {

	public static void main(String[] args) {
		
		/* Print out the position of the first occurrence of "c"
		* Print out the position of the first occurrence of " "
		* Print out the position of the first occurrence of the variable target1
		* Print out the position of the first occurrence of the variable target2 */
		
		String str="abracaddabra alakazam";
		String target1="dab";
		String target2="ABRA";
		  
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf(" "));
		System.out.println(str.indexOf(target1));
		System.out.println(str.indexOf(target2));

	}

}
