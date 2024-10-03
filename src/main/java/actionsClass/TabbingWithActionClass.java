package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabbingWithActionClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Tabbing();

	}

	public static void Tabbing() throws InterruptedException {
		//driver.get("https://www.freshworks.com/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		
		act.sendKeys(firstName, "Ramya")
		               .sendKeys(Keys.TAB)
		                   .sendKeys("sharma")
		                      .sendKeys(Keys.TAB)
		                         .sendKeys(Keys.TAB)
		                            
		                       .build().perform();
		
		Thread.sleep(3000);

		driver.quit();

	}

}
