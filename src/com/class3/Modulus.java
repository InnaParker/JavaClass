package com.class3;

public class Modulus {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int div = a / b;

		// modulus operator

		int mod = a % b;

		System.out.println(mod);

		//Parentheses, Exponents, Multiplication/Division, Modulus,
		// Addition/Subtraction
		
		int e = -5 + 4 * 6; // 19
		int x = (22 + 9) % 7; // 3
		int y = 20 + -3 * 5 / 8; // 19
		int z = 5 + 15 / 3 * 2 - 8 % 3; // (5+10-2) =13

		System.out.println(z);

	}

}
