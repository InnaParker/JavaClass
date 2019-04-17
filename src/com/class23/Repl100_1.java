package com.class23;

public class Repl100_1 {
	
	/* Complete SyntaxTechnologies class with variables: String schoolName, int batch,
	 * String year, String lastDayOfClass. Write 2 constructors:
	 * 1. Default. 2. Main with all parameters.
	 * Output: null 0 null null    Syntax 4  2019   07/30/2019   */

	String schoolName;
	int batch;
	String year;
	String lastDayOfClass;
	
	public void s1() 
	{
	System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public void s2(String schoolName, int batch, String year, String lastDayOfClass) 
	{
	System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public static void main(String[] args) {
		
		Repl100_1 obj1=new Repl100_1();
		obj1.s1();
		
		Repl100_1 obj2=new Repl100_1();
		obj2.s2("Syntax", 4, "2019", "07/30/2019");
	}

}
