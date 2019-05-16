package com.class28;

public interface WebDriver extends TakesScreenshot{

	// Create a WebDriver Interface that will have the following unimplemented 
	// behavior: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	// Create 2 classes that implements WebDriver interface: ChromeDriver and 
	// FirefoxDriver.

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}

class ChromeDriver extends Browser implements WebDriver, Report {

	@Override
	public void openBrowser() 
	{
		System.out.println("Chrome opens window");
	}

	@Override
	public void closeBrowser() 
	{
		System.out.println("Chrome closes window");
	}

	@Override
	public void maximizeWindow() 
	{
		System.out.println("Chorme maximizes window");
	}

	@Override
	public void findElement() 
	{
		System.out.println("Chrome finds element");
	}

	@Override
	public void refreshBrowser() 
	{
		System.out.println("Chrome can refresh browser");
	}

	@Override
	public void getReport() 
	{
		System.out.println("Chrome can get a report");
	}

	@Override
	public void takesScreenshot() 
	{
		System.out.println("Chrome takes screenshots");	
	}
}

class FirefoxDriver extends Browser implements WebDriver, Report {

	@Override
	public void openBrowser() 
	{
		System.out.println("Firefox opens window");
	}

	@Override
	public void closeBrowser() 
	{
		System.out.println("Firefox closes window");
	}

	@Override
	public void maximizeWindow() 
	{
		System.out.println("Firefox maximizes window");
	}

	@Override
	public void findElement() 
	{
		System.out.println("Firefox finds element");
	}
	
	public void refreshBrowser()
	{
		System.out.println("Firefox can refresh browser");
	}

	@Override
	public void getReport() 
	{
		System.out.println("Firefox can get a report");
	}

	@Override
	public void takesScreenshot() 
	{
		System.out.println("Firefox takes screenshots");	
	}
}
