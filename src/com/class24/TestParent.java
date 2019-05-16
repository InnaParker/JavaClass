package com.class24;

public class TestParent {

	public static void main(String[] args) {
		
		String a;
		a="10";
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		// Type casting
		Parent child=new Child();
		child.love();
		child.work();
		
		
		

	}

}
