package com.class29;

public class TestRegistration {

	public static void main(String[] args) {
		
		Registration obj=new Registration();
	    obj.setEmail("@gmail.com");
	    obj.setUserName("java123");
	    obj.setPassword("msterkey");
	    
	    System.out.println(obj.getEmail());
	    System.out.println(obj.getPassword());
	    System.out.println(obj.getUserName());

	}

}
