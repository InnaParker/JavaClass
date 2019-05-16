package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.m2();
		obj.takesScreenshot();
		TakesScreenshot.m1(); //access static method in static way by using class
							  //name/interface where method is defined

		WebDriver obj1=new FirefoxDriver();
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
	}

}
