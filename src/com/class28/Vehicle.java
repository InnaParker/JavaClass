package com.class28;

public abstract class Vehicle {
	
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
	}
	
	//public static void gps(); - cannot override static abstract method
	//public abstract final void break(); - cannot use final with abstract
	//or private, because cannot override and inherit
	
	protected abstract void start();
	public abstract void drive();
	
	public void stop()
	{
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotal()
	{
		System.out.println("Total vehicles we built:"+vehicleCount);
	}
}

abstract class Car extends Vehicle {
	//Inside child class compiler will add by default constructor 
	// and will call parent class constructor with super word.
	//Car() { 
	//super();}
	
	public String make; //instance variables allowed in abstract class
	//We cannot create obj of abstr class, but if we have instance
	//variables iside the class we use constructor to initialize them.
	Car(String make){
		this.make=make;
	}
}

class BMW extends Car {
	
	BMW(String make) {
		super(make);
	}

	//BMW() {
	//super();
	//}
	
	@Override
	public void start() 
	{
		System.out.println("BMW start remotly");
	}

	@Override
	public void drive() 
	{
		System.out.println("BMW drives fast");
	}	
}

class Toyota extends Car {

	Toyota(String make) {
		super(make);
		
	}

	@Override
	public void start() 
	{
		System.out.println("Toyota starts with push button");
	}

	@Override
	public void drive() 
	{
		System.out.println("Toyota drives safe");
	}
	
}