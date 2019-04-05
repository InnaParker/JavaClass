package com.class17;

public class Task1 {

	public static void main(String[] args) {
		
		// 1. Create a method that will take 2 parameters as a numbers and 
		// prints which number is larger.

		Task1 obj=new Task1();
		obj.findLargest(23, 131);
		
	}
	
	void findLargest(int a, int b) {
		
		if (a>b) {
			System.out.println("A is larger than B"); 
		}else {
			System.out.println("B is larger than A");
		}

}
}
