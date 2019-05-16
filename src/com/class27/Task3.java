package com.class27;

public class Task3 {
	
	/* Create a class File that will have the following behaviors: 
	 * open, edit, close. Edit and close are implemented method while 
	 * open is an abstract. Create 3 subclasses: JavaFile, WordFile, 
	 * PDFFile that will provide specific implementation of open 
	 * behavior: Example: to open .java file we need notepad++ or sublime 
	 * text, to open .doc file we need Microsoft word to be installed
	 */

	public static void main(String[] args) {
	
		JavaFile obj1=new JavaFile();
		obj1.open();
		
		WordFile obj2=new WordFile();
		obj2.open();

	}
}

abstract class File {
	
	public abstract void open();
	
	public void edit()
	{
		
	}
	
	public void close()
	{
		
	}
}
class JavaFile extends File {

	@Override
	public void open() 
	{
		System.out.println("To open .jave file we use sublime text");	
	}
	
}
class WordFile extends File {

	@Override
	public void open() 
	{
		System.out.println("To open .doc file we use Microsoft Word");
	}
	
}
