package com.qa.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestngAnnotationsclass {
	@BeforeTest
	public void demoBeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void demoAfterTest()
	{
		System.out.println("After Test");
	}
	
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
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch the browser");
	}
	@AfterClass
	public void closure()
	{
		System.out.println("Close the browser");
	}


}
