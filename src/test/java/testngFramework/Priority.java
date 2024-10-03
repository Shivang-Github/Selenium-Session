package testngFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	//@BeforeTest(priority=2)
	public void bt() {
		
		System.out.println("--this is before test--");
		
	}
	//@BeforeClass(priority=1)
	public void bc() {
		
		System.out.println("--this is before class--");
			
	}
	//@BeforeSuite(priority=100)
	public void bs() {
		
		System.out.println("--this is before suite--");
				
	}
	//@BeforeMethod(priority=99)
	public void bm() {
		
		System.out.println("--this is before method--");
	}
	
	
	
	

	@Test()
	public void z() {

		System.out.println("-----method ZZ---");
	}

	@Test()
	public void a() {

		System.out.println("-----method AA---");
	}

	@Test()
	public void b() {

		System.out.println("-----method BB---");
	}

	@Test(priority = 2)
	public void a(String a) {

		System.out.println("-----Overloaded method AA---");
	}

}
