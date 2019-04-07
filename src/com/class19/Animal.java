package com.class19;

public class Animal {
	
	/*Create a class call Animal have properties like breed, weight, age, 
	 * name and methods line canBark,isWild. Make the name variable static */

	String breed="Husky";
	static String name="Belka";
	int weight=50, age=7;

	boolean canBark() {
		return true;
	}
	
	boolean isWild() {
		return false;
	}
	
}

