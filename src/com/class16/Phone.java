package com.class16;

public class Phone {
	
	/* Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, 
	 * Nokia with specific  attributes and behaviors.
	 */
	
	String color, model;
	int screen, memory;
	
	
	public static void main(String[] args) {
		
		Phone p1=new Phone();
		
		p1.model="iPhone";
		p1.color="Gold";
		p1.screen=6;
		p1.memory=128;
	
		p1.answerCall();
		p1.sendText();
		p1.browseInternet();
		
		Phone p2=new Phone();
		
		p2.model="Android";
		p2.color="Silver";
		p2.screen=5;
		p2.memory=64;
		
		p2.answerCall();
		p2.sendText();
		p2.browseInternet();
		
		Phone p3=new Phone();
		
		p3.model="Nokia";
		p3.color="Black";
		p3.screen=4;
		p3.memory=16;

		p3.answerCall();
		p3.sendText();
		p3.browseInternet();
}

	void browseInternet() {
		System.out.println();	
	}

	void sendText() {
		System.out.println();	
	}

	void answerCall() {
		System.out.println();	
	}
}
