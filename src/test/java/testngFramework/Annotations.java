package testngFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("-----before method----"); }

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("-----before suite-----");

	}
	@Test
	public void A() {
		
		
		System.out.println("----A -test method----");
		
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("-----before test-----");

	}
	@Test
	public void D() {
		
		
		System.out.println("----- D test method----");
		
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("------before class-----");
	}

	
	
	
	@Test
	public void B() {
		
		
		System.out.println("----B -test method----");
		
	}
	@Test
	public void C() {
		
		
		System.out.println("----C-test method----");
		
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("-----after class----");
		
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("-----after test----");
		
		
	}
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("-----after suite----");
		
	}
	
	
	
	
	
	


}
