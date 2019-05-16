package com.class26;

public class TestPhone {

	public static void main(String[] args) {
		
		System.out.println("-------Object of parent class");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();

		System.out.println("-------Object of iPhone");
		IPhone iphone=new IPhone();
		iphone.makeCall();
		iphone.hasCamera();
		
		System.out.println("-------Object of Samsung");
		Samsung samsung=new Samsung();
		samsung.hasCamera();
		samsung.makeCall();
		
		System.out.println("-------Object of Nokia");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		
		System.out.println("---Object of IPhone referring to the Phone parent class");
		Phone p=new IPhone();
		iphone.makeCall();
		iphone.hasCamera();
		
		Phone p1=new Nokia();
		p1.makeCall();
		p1.hasCamera();
		
		// Creating reference variable of parent type so we can access child during runtime
		Phone parentPhone; 
		
		//Assigning iPhone object
		parentPhone=new IPhone();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		//Assigning Samsung object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		//Assigning Nokia object
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
	}

}
