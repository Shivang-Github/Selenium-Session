package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		   driver= new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			Thread.sleep(4000);
			
	
		
		
		
		
	}

}
