package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
	   driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(4000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String pageTitle=js.executeScript(" return document.title;").toString();
	
		Object pageURL =js.executeScript("return document.URL");
		
		
		System.out.println(pageTitle);
		System.out.println(pageURL);
		
	
		
		driver.quit();
	
		

	}

}
