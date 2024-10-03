package testngFramework;

import org.testng.annotations.Test;

public class WithPandWithoutPriority {
	
	
	
	@Test(priority=1)
	public void login() {
		
		System.out.println("----login---");
		
		
	}
	
	

	@Test
	public void logout() {
	
		System.out.println("----logout---");
		
		
	}
	
	
	
	

}
