package com.class16;

public class Dog {

	String breed,color, size;
	int 	age;
	
	/* Create a Dog Class and create 3 different objects of it: Husky, 
	 * Bulldog, Labrador  with specific  attributes and behaviours.
	 */
	
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="Husky";
		dog1.color="Grey";
		dog1.size="medium";
		dog1.age=5;
	
		dog1.plays();
		dog1.eats();
		dog1.barks();
		
		Dog dog2=new Dog();
		
		dog2.breed="Bulldog";
		dog2.color="Brown";
		dog2.size="small";
		dog2.age=4;
		
		dog2.plays();
		dog2.eats();
		dog2.barks();
		
		Dog dog3=new Dog();
		
		dog3.breed="Labrador";
		dog3.color="Black";
		dog3.size="large";
		dog3.age=10;

		dog3.plays();
		dog3.eats();
		dog3.barks();
}

	void plays() {
		System.out.println();	
	}

	void eats() {
		System.out.println();	
	}

	void barks() {
		System.out.println();	
	}
	
}
