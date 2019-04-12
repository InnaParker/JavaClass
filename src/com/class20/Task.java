package com.class20;

public class Task {
	
	/* Create a method createEmail(). Based on provided user name,
	 * lastName and email type, your method should return complete 
	 * email address. Example - johnsnow@gmail.com.
	 */

	String createEmail(String name, String lastName,String emailType) {
		
		String email=name+lastName+"@"+emailType+".com";
		return email;
	}
	
	public static void main (String[] args){
		
		Task obj=new Task();
		String email="John"+"Snow"+"@"+"gmail"+".com";
		System.out.println(email.toLowerCase());
	}
}
