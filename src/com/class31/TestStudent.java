package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		
		Student obj1=new Student("John", 101);
		Student obj2=new Student("James", 102);
		Student obj3=new Student("Anna", 103);
		Student obj4=new Student("Katy", 104);

		ArrayList<Student> alist=new ArrayList<>();
		alist.add(obj1);
		alist.add(obj2);
		alist.add(obj3);
		alist.add(obj4);
		
		for (Student student: alist) {
			//student.printStudentDetails();
			System.out.println(student.name);
			
		}
		
		Iterator<Student> it=alist.iterator();
		while(it.hasNext()) {
			Student obj=it.next();
			obj.printStudentDetails();
		}
	}
}
