package testngFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount1 {

	// these counts are using to run same TC's multiple times

	@BeforeMethod
	public void bf() {

		System.out.println("------i am Before Method---------");
	}

	@AfterMethod
	public void AF() {

		System.out.println("------i am After Method---------");
	}

	@Test(invocationCount = 2)
	public void login() {

		System.out.println(" my name is shivang");

	}

	@Test(invocationCount = 3)
	public void A() {

		System.out.println("I am a method");

	}

}