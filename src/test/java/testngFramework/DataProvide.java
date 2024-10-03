package testngFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class DataProvide {

	// public Object[][] getData() {

	// new return Object[][] {};

	@DataProvider
	public Object[][] getData() {

		Object[][] obj = new Object[3][3];

		obj[0][0] = "shivang";
		obj[0][1] = "3rd class";
		obj[0][2] = 7;

		obj[1][0] = "Ravi";
		obj[1][1] = "11th class";
		obj[1][2] = 17;
		
		return obj;

	}

	@Test(dataProvider = "getData")
	public void studentDetails(String name, String Class, int Age) {

		System.out.println("my name is " + " " + name);
		System.out.println("my class is " + " " + Class);
		System.out.println("my age  is " + " " + Age);

	}

	

}
