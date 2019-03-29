package com.class12;

public class Repl71 {

	public static void main(String[] args) {
		
		/* Output 1: print str starting at index 5 to the end
		 * Output 2: print str starting at index 7 and ending at 10
		 * Output 3: print "harambe" from the string
		 * Output 4: print "t f" from the string line
		 */

		String str="laptops out for harambe";
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(7,10));
		System.out.println(str.substring(16));
		System.out.println(str.substring(10,13));
	}

}
