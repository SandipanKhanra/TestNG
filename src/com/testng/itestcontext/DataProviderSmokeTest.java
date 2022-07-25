package com.testng.itestcontext;

import org.testng.annotations.Test;

public class DataProviderSmokeTest {
	@Test(dataProvider = "TestType", dataProviderClass = DataProviderClass.class)
	public void smokeTest(String sname) {
		System.out.println(sname);
	}
}
