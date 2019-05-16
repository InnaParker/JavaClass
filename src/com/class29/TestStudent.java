package com.class29;

public class TestStudent {

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.setName("John");
		//obj.age=17;
		obj.setAge(17);
		
		System.out.println(obj.getName()+" is "+obj.getAge());

	}

}
