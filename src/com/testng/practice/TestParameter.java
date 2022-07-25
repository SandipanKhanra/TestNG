package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@Parameters("browser")
	@Test
	public void testBrowser(String browserName) {
		System.out.println("Browser is " + browserName);
	}

	@Parameters({"username","password"})
	@Test
	public void testLogin(String userName,String password) {
		System.out.println("UserName is " + userName);
		System.out.println("Password is "+ password);
	}
}
