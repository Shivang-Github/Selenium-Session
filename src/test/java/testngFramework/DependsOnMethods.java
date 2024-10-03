package testngFramework;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	//IF Dependent method has been failed then individual method skipped
	//if two methods having same priority then it will pick 
    //if any method id dependent and if we set prirority =1 also it wont run until dependent method do not run
	
	
	
	@Test(dependsOnMethods="B",priority=2)
	public void C() {
		
		System.out.println("--I AM C---");
		
	}
	

	@Test(priority=2)
	public void A() {
		System.out.println("--I AM A---");
		
		
		
	}
	

	@Test(priority=3)
	public void B() {
		
		System.out.println("--I AM B---");
		//int i=9/0;
		
	}
	
	@Test(priority=1)
	public void Z() {
		System.out.println("i am Z");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
