package com.testng.itestcontext;

import org.testng.annotations.Test;

public class DataProviderUnitTest {
	@Test(dataProvider = "TestType", dataProviderClass = DataProviderClass.class)
	public void unitTest(String sname) {
		System.out.println(sname);
	}
}
