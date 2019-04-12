package com.class21;

public class Employee {
	
	/* Create a Class called Employee: Create three  variables  eID , salary and 
	 * set the CEO to “Sumair”. Create two objects of the class Employee
	 * Set the value of eID, salary for each of the objects
	 * Print out the eID , salary and  CEO for each of the objects */
	
	int eID;
	int salary;
	public static String CEO="Sumair";

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.eID=1;
		e1.salary=100000;
		e1.employeeInfo();
		
		Employee e2=new Employee();
		e2.eID=2;
		e2.salary=150000;
		e2.employeeInfo();
		
		
	}

	public void employeeInfo()
	{
		System.out.println("CEO "+CEO+" ID: "+eID+" with salary "+salary);
	}
}
