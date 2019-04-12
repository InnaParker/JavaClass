package com.class21;

import com.class20.AccessModifiers;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		
		obj.isPalindrome("Hello"); //accessing public in different package
		//In different package can only access public, unless use inheritance.
		
		System.out.println(obj.name3); //only public is available in diff package
		

	}

}
