package com.testng.itestcontext;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "TestType")
	public static Object[][] dataSet1(ITestContext context) {
		String testName = context.getName();
		if (testName.equals("Smoke Test")) {
			return new Object[][] { { "Performing smoke testing" } };
		} else if (testName.equals("Unit Test")) {
			return new Object[][] { { "Performing unit testing" } };
		} else if (testName.equals("Regression Test")) {
			return new Object[][] { { "Performing regression testing" } };
		} else {
			return new Object[][] { { "Performing common test" } };
		}
	}

	@DataProvider(name = "Scenario")
	public static Object[][] dataSet2(Method method) {
		String methodName = method.getName();
		if (methodName.equals("scenario1")) {
			return new Object[][] { { "Performing scenario 1 testing" } };
		} else if (methodName.equals("scenario2")) {
			return new Object[][] { { "Performing scenario 2 testing" } };
		} else {
			return new Object[][] { { "Performing common test" } };
		}
	}
}
