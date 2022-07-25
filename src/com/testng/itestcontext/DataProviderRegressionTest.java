package com.testng.itestcontext;

import org.testng.annotations.Test;

public class DataProviderRegressionTest {
	@Test(dataProvider = "TestType", dataProviderClass = DataProviderClass.class)
	public void regressionTest(String sname) {
		System.out.println(sname);
	}
}
