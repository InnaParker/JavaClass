package com.class29;

class EncapsulationDemo3 {
	
	  private String empName="John";
	  private int empAge=30;
	
	  public String getEmpName() {
		return empName;
	}

	  public int getEmpAge() {
		return empAge;
	}
}

public class Repl144 {

	public static void main(String[] args) {
		
		EncapsulationDemo3 obj=new EncapsulationDemo3();
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee Age: "+obj.getEmpAge());

	}

}
