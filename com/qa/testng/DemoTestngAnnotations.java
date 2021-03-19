package com.qa.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestngAnnotations {
	
	@Test
	public void login ()
	{
		System.out.println("Enter user credentails and login");
	}
	
	@Test
	public void homepage()
	{
		System.out.println("Welcome to the home page");
	}

	@Test
	public void registration()
	{
		System.out.println("Registration details");
		
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Launch the browser");
	}
	@AfterMethod
	public void closure()
	{
		System.out.println("Close the browser");
	}
}
