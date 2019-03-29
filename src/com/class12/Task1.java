package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*Accept username, password and confirm password and check following requirements:
		* 1. Username and Password cannot be  empty, if so→ message=”Username and Password 
		* cannot be empty”.
		* 2. Password should be minimum 8 characters, if less → message=”Password is too 
		* short”.
		* 3. Password cannot contain username if so, → message=”Password cannot contain 
		* username”.
		* 4. Password should match confirmed password, if not  → message “Passwords do not 
		* match”.
		* 5.Only after all requirements met → message “Your username and password has been 
		* created".  */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your user name");
		String username=scan.nextLine();
		
		System.out.println("Please enter your password with min 8 charachters");
		String password=scan.nextLine();
	
		System.out.println("Please confirm your password");
		String confirmPw=scan.nextLine();
		
		if (!(username.isEmpty() && password.isEmpty())) { //1st checkpoint
			
			if (password.length()>8) {  //2nd checkpoint
				
				if (!password.contains(username)) { //3rd checkpoint
					
					if (password.contentEquals(confirmPw)) {	//4th checkpoint
						
						System.out.println("Your user name and password have been created");
						
					}else {
						System.out.println("Passwords do not match");}
					
				}else {
					System.out.println("Password cannot contain username");}
					
			} else {
						System.out.println("Password is too short");}
				
		}else {
				System.out.println("Username and password cannot be empty");}
		
		
	}
}
