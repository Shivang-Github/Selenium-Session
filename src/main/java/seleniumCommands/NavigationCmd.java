package seleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmd {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	
		//Navigate();
		withoutNavigateCmd();
		
	}
	
	public static  void Navigate() throws Exception {
		 driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	//without navigation also will work 
	public static void withoutNavigateCmd() throws Exception {
		
		    driver =new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.get("https://www.amazon.com");
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.quit();
			
		
	}
	//this will refresh whole DOM user may get "StaleElementException also with this
	public static void RefreshWin() throws Exception {
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	
	

}
