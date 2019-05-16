package com.class23;

public class Repl111 {
	/* Please create the different methods with different access modifiers 
	 * and try to access those methods in the main class. In each method 
	 * write the logic accordingly like if for private method write the 
	 * logic in the println Statement as "This is Private Method" 
	 * accordingly for rest methods should be a total of 4 outputs, please 
	 * make sure they are same order that is printed below>
	 * Output:
	 * This is Private Method
	 * This is Default Method
	 * This is Protected Method
	 * This is Public Method    */
	
	private void m1()
	{
		System.out.println("This is Private Method");
	}
	
	void m2()
	{
		System.out.println("This is Default Method");
	}
	
	protected void m3()
	{
		System.out.println("This is Protected Method");
	}
	
	public void m4()
	{
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		
		Repl111 obj1=new Repl111();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m4();
	}

}
