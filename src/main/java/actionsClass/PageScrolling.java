package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		//PartialScrolling();
		
		//TopToBottonScrolling();
		
		ScrollingToElement();
         
	}

	public static void PartialScrolling() throws InterruptedException {
		driver.get("https://www.freshworks.com/");
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);

		driver.quit();

	}

	public static void TopToBottonScrolling() throws InterruptedException {

		driver.get("https://www.freshworks.com/");
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END);
        Thread.sleep(3000);
        
        act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME);
        
        driver.quit();
	}

	public static void ScrollingToElement() throws InterruptedException {

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.cssSelector("[type='checkbox'],[name='agree']")))
		        .pause(1000).click(driver.findElement(By.cssSelector("[type='checkbox'],[name='agree']")))
		           .build().perform();
		            
		Thread.sleep(3000);
		driver.quit();
	}

}
