package com.class19;

public class VariableTypes {
	
	//Static Test. Put Static in front of int and see the difference. 
	
	int a=10;
	
	public static void main(String[] args) {

        VariableTypes obj1 = new VariableTypes();
        
        obj1.a = 15;
        
        System.out.println(obj1.a);

        VariableTypes obj2 = new VariableTypes();
        
        System.out.println(obj2.a);

}
}
