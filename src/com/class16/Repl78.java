package com.class16;

public class Repl78 {

	String breed,name,color;
	
	
	public static void main(String[] args) {
		
		/* Create a Class main that should be a template for the DogClass. 
		* In this class you should specify the following attributes: breed, name, 
		* color and following behaviors: bark(), run(), play().
		* Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  
		* attributes and behaviors.
		* The output of the program should be as following:
 		*
		* Husky can bark, Husky can run, Husky can play
		* Bulldog can bark, Bulldog can run, Bulldog can play
		* Labrador can bark, Labrador can run, Labrador can play */
		
		Repl78 dog1=new Repl78();
		
		dog1.breed="Husky";
		dog1.name="Space";
		dog1.color="Grey";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		
		Repl78 dog2=new Repl78();
		
		dog2.breed="Bulldog";
		dog2.name="Spunky";
		dog2.color="Brown";
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		Repl78 dog3=new Repl78();
		
		dog3.breed="Labrador";
		dog3.name="Max";
		dog3.color="Yellow";
		
		dog3.bark();
		dog3.run();
		dog3.play();
}

	void bark() {
		System.out.println(breed+" can bark");	
	}

	void run() {
		System.out.println(breed+ " can run");	
	}

	void play() {
		System.out.println(breed+ " can play");	
	}
	

	

}
