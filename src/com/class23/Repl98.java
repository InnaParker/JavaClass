package com.class23;

public class Repl98 {
	
	/* 1. Complete Car class. Include following variables:
	 *  make, model, numberOfDoors, topSpeed, price.
	 *  All class variables should be declared case sensitive.
	 *  Write 4 consrtuctors: 1. With all parameters. 
	 *  2. Does not include number of doors (4 is default).
	 *  3. Does not include make and model. Default-unknown.
	 *  4. Does not include top speed and price. Default - 90 and 0.
	 *  
	 *   Test your code in Main class. Create several car objects using
	 *   all Constructors and print fields.
	 *   Output: Toyota Prius 4 120 30000.0
	 *   Toyota Prius 4 120 30000.0   Unknown Unknown 4 120 30000.0
	 *   Toyota Prius 4 90 0.0 */

	String make="Unknown";
	String model="Unknown";
	int numberOfDoors=4;
	int topSpeed=90;
	double price=0.0;

	public void car1(String make, String model, int numberOfDoors, int topSpeed, double price) 
	{
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	public void car2(String make, String model, int topSpeed, double price) 
	{
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	public void car3(int numberOfDoors, int topSpeed, double price) 
	{
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	public void car4(String make, String model, int numberOfDoors) 
	{
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	public static void main(String[] args) {
		
		Repl98 obj1=new Repl98();
		obj1.car1("Toyota", "Prius", 4, 120, 30000.0);
		
		Repl98 obj2=new Repl98();
		obj2.car2("Toyota", "Prius", 120, 30000.0);
		
		Repl98 obj3=new Repl98();
		obj3.car3(4, 120, 30000.0);
		
		Repl98 obj4=new Repl98();
		obj4.car4("Toyota", "Prius", 4);
		
	
	}

}
