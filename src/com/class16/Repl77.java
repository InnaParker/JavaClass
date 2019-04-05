package com.class16;

public class Repl77 {
	
	/* Create a class named "Main" with specific attributes.
	 * Create 2 objects in which you will be assigning following values:
	 * carColor="Black" carModelYear=2019 carName="BMW"
	 * carColor="White" carModelYear=2018 carName="Toyota"
	 * To print: Car color is black and car model year is 2019 and car name is BMW
	 * Car color is white and car model year is 2018 and car name is Toyota.
	 */
	String carColor, carName;
	int carModelYear;
	
	public static void main(String[] args) {
		
		
		Repl77 car1=new Repl77();	
		
		car1.carColor="Black";
		car1.carName="BMW";
		car1.carModelYear=2019;
		
		System.out.println("Car color is "+car1.carColor+" and car model is "+car1.carModelYear+" and car name is "+car1.carName);
		
		
		Repl77 car2=new Repl77();
		
		car2.carColor="White";
		car2.carName="Toyota";
		car2.carModelYear=2018;
		
		System.out.println("Car color is "+car2.carColor+" and car model is "+car2.carModelYear+" and car name is "+car2.carName);
		
}
}