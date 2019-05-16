package com.class27;

public abstract class Phone {
	
	public void makeCall()
	{
		System.out.println("Phone can make a call");
	}
	
	public void sendText()
	{
		System.out.println("Phone can send text");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();

}

class iPhone extends Phone {  //Concrete class inherited from abstract class or
	//implemented by interface and providing implementation of all unimplemented/
	//abstract classes.

	@Override
	public void unlockPhone() {
		System.out.println("To unlock phone we use finger print or Face ID");
	}

	@Override
	public void viewPictures() {
		System.out.println("We can look at photos in Images");
	}
}
class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock we need yo use password");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures go to Gallery");
	}
}