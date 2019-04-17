package com.class24;

public class TestEmplyoees {

	public static void main(String[] args) {
		
		Employee emp=new Employee ();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor ctr=new Contractor();
		
		emp.getPaid();
		ft.getPaid();
		ctr.getPaid();

	}

}
