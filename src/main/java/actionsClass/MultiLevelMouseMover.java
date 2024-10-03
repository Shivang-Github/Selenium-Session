package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMouseMover {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver =new ChromeDriver();
		driver.get("https://www.bigbasket.com/?nc=logo");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		By Level1=By.xpath("(//span[text()='Shop by'])[2]");
		By Level2=By.linkText("Foodgrains, Oil & Masala");
		By Level3=By.linkText("Dry Fruits");
		By Level4=By.linkText("Cashews");
		
		
		
		ParentChildMenuHandling(Level1,Level2,Level3,Level4);
		

	}
	
	public static void ParentChildMenuHandling(By Level1,By Level2,By Level3, By Level4) throws InterruptedException {
		
		getElement(Level1).click();
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		act.moveToElement(getElement(Level2)).perform();
		
		Thread.sleep(2000);
	    act.moveToElement(getElement(Level3)).perform();
	    Thread.sleep(2000);
		act.moveToElement(getElement(Level4)).perform();
		
		driver.quit();
	}
	
	
	
	
	
	public static WebElement getElement(By locator) {
		
		
		return driver.findElement(locator);
		
	}
	
	
	

}
