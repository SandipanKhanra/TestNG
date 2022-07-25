package com.testng.itestcontext;

import org.testng.annotations.Test;

public class DataProviderParameters {
	@Test(dataProvider = "Scenario",dataProviderClass = DataProviderClass.class)
	public void scenario1(String sname) {
		System.out.println(sname);
	}
	
	@Test(dataProvider = "Scenario",dataProviderClass = DataProviderClass.class)
	public void scenario2(String sname) {
		System.out.println(sname);
	}
	
	@Test(dataProvider = "Scenario",dataProviderClass = DataProviderClass.class)
	public void commonscenario(String sname) {
		System.out.println(sname);
	}
}
