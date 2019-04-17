package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee{
	
	public static void main(String[] args) {
		
		WaterfallTeam wt=new WaterfallTeam();
		
		wt.salary1=90000;
		
		wt.test(); //available because it's protected
		
			
				
	}

}
