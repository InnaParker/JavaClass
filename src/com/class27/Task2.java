package com.class27;

public class Task2 {
	
	/* Write program: user class has a constructor that takes name 
	 * and mobile number. Extend this class  by userInfo that will 
	 * have user address variable. Print users name, mobile number 
	 * and address in userDetails method. Test your code. */

	public static void main(String[] args) {
		
		UserInfo obj1=new UserInfo("Leslie Spencer", "332-223-1234", "33 Main Str, Jonson City");
				obj1.userDetails();
	}
}

class User {
	
	public String name;
	public String mobileNumber;
	
	User (String name, String mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}
class UserInfo extends User{
	
	public String address;
	
	public UserInfo(String name, String mobileNumber, String address){
		super(name, mobileNumber);
		this.address=address;
	}
	public void userDetails() {
		System.out.println("User name is "+name+" mobile number is "+mobileNumber+" and address is "+address);
		
	}
}
