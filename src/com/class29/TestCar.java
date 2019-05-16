package com.class29;

public class TestCar {

	public static void main(String[] args) {
		
		Car truck=new Truck("blue", 25000, 3000);
		double carPrice=truck.calculateSalePrice();
		
		System.out.println(carPrice);
		
		Car sedan=new Sedan("blue", 25000, 3000);
		double carPrice1=sedan.calculateSalePrice();
		
		System.out.println(carPrice);
	}
}
