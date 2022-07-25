package com.testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterExample {
	@Test(dataProvider = "getData")
	public void testAddition(int actual, int expected) {
		int modifiedValue = actual + 10;
		Assert.assertEquals(modifiedValue, expected);
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { 300, 310 }, { 200, 210 }, { 20, 20 }, { 46, 56 } };
	}
}
