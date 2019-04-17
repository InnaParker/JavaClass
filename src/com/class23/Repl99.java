package com.class23;

public class Repl99 {
	
	/* Complete Store Product class. Include following variables: label, int price,
	 * category, hasExpiration (boolean), stock (int). Write 3 constructors:
	 * 1. Main constructor with all parameters.
	 * 2. Does not have category (def-misc) and expiration (def-false).
	 * 3. Does not have category, expiration and stock (def-0).
	 * Output:
	 * Eggs 3 Produce true 10
	 * Paper Towels 2 misc false 24
	 * Paper Towels 2 null false 0   */
	
	String label;
	int price;
	String category;
	boolean hasExpiration=false;
	int stock=0;

	public void p1(String label, int price, String category, boolean hasExpiration, int stock) 
	{
	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	public void p2(String label, int price, int stock) 
	{
		String category="misc";
	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	public void p3(String label, int price) 
	{
	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}

	public static void main(String[] args) {
		
		Repl99 obj1=new Repl99();
		obj1.p1("Eggs", 3, "Produce", true, 10);
		
		Repl99 obj2=new Repl99();
		obj2.p2("Paper Towels", 2, 24);
		
		Repl99 obj3=new Repl99();
		obj3.p3("Paper Towels", 2);
		

	}

}
