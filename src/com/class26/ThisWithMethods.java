package com.class26;

public class ThisWithMethods {
	
	public void m1() {
		System.out.println("I am m1 method");
	}
	
	public void m2() {
		m1();//by default compiler adds this.
		System.out.println("I am m2 method");
	}
	
	public static void main(String[] args) {
		
		ThisWithMethods obj=new ThisWithMethods();
		obj.m2();
	}

}
