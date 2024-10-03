package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//perform() is mandatory
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);
		
		Actions act= new Actions(driver);
		
		act.sendKeys(driver.findElement(By.cssSelector("input[name=search]")),"mobile").perform();
		
		Thread.sleep(2000);
		
		act.click();
		
		act.click(driver.findElement(By.cssSelector("#search button"))).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		//how many ways user can do sendKeys operation 
		//1. WebElement SendKeys
		//2. Actions SendKeys
		//3. JavaScript Executor 
		
		//Click operation
		//1. WE Click
		//2. Actions Click
		//3. JavaScript Executor Click

	}

}
