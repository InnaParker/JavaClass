package com.class23;

import com.class21.Employee;

public class Repl100 {
	
	/* Complete Employee class: include following variables: String name, String lastName,
	 * int emplyeeId, String startDay, int salary. Write 2 constructors.
	 * 1. default, 2. main with all parameters.
	 * Output should be:
	 * null null 0 null 0
	 * Joe Smith 12345  01/01/1970 35000
	 */

	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	public void e1() 
	{
	System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	public void e2(String name, String lastName, int employeeId, String startDate, int salary) 
	{
	System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	
	public static void main(String[] args) {
		
		Repl100 obj1=new Repl100();
		obj1.e1();
		
		Repl100 obj2=new Repl100();
		obj2.e2("Joe", "Smith", 12345, "01/01/1970", 35000);
	}

}
