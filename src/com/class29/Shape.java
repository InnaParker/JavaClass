package com.class29;

public interface Shape {
	/* Create an Interface ‘Shape’ with undefined methods as calculateArea() 
	 * and calculatePerimiter(). Create 2 child classes: Circle & Square that 
	 * should have an implementation of area and perimeter calculation. Test 
	 * your code.
	 */
	
	void calculateArea(double num);
	void calculatePerimeter(double num);
}

class Circle implements Shape{

	double pi=3.14159;
	
	@Override
	public void calculateArea(double num) {
		
		double area=pi*(num*num);
		System.out.println("Area of the circle is "+area);
	}

	@Override
	public void calculatePerimeter(double num) {
		
		double perimeter=2*(pi*num);
		System.out.println("Perimeter of the circle is "+perimeter);
	}
}

class Square implements Shape {
	
	int side=12;

	@Override
	public void calculateArea(double num) {

		int area=side*side;
		System.out.println("Perimeter of the square is "+area);
	}

	@Override
	public void calculatePerimeter(double num) {
		
		int perimeter=4*(4*side);
		System.out.println("Perimeter of the square is "+perimeter);
	}	
}

class TestShape {
	
	public static void main(String[] args) {
        Circle circle=new Circle();
        circle.calculateArea(20);
        circle.calculatePerimeter(20);
        
        Shape obj1=new Circle();
        obj1.calculateArea(12);
        
        Square square=new Square();
        square.calculateArea(15);
        square.calculatePerimeter(21);
        
    }
}
