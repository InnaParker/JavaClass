package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 198;
		int b = 198;

		boolean result = a > b;
		boolean result1 = a == b;

		System.out.println(result);

		// compare 2 numbers and if a is larger than b -> print

		if (a != b) {

			System.out.println("a is larger than b");
		} else {

			System.out.println("b is larger than a");

			// declare price and if price is higher that expected -> print I will not buy

			double shoesPrice = 32.99;
			double allowedPrice = 31.99;

			if (shoesPrice <= allowedPrice) {

				System.out.println("I am buying those shoes");

			} else {
				System.out.println("I am Not buying those shoes");

			}
			System.out.println("I am continuous code");

		}

	}

}
