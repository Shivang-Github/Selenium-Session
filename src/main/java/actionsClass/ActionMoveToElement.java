package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//perform() is mandatory
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		Thread.sleep(4000);
		
		
		By AddOns= By.xpath("//div[text()='Add-ons']");
		By parentMenu = By.xpath("(//div[text()='SpiceClub'])[position()=1]");
		
		By ChildMenu=By.xpath("(//div[text()='Benefits'])[position()=1]");
		
		MoveToElement(parentMenu,ChildMenu);
		
		/*Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(SpiceClub)).perform();
		
		Thread.sleep(2000);
		driver.findElement(benefits).click();
		
		
		
		*/
		Thread.sleep(3000);
		
		driver.quit();	
		

	}
	
	
	
	public static void MoveToElement(By parentMenu,By ChildMenu) throws InterruptedException {
		
		Actions act= new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		
		getElement(ChildMenu).click();
		
	}
	
    public static void MoveToElement(String parentMenu,String ChildMenu) throws InterruptedException {
		
		Actions act= new Actions(driver);
		
		act.moveToElement(getElement(By.xpath("//*[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(3000);
		
		getElement(By.xpath("//*[text()='"+ChildMenu+"']")).click();
	
	
    }
	
	public static WebElement getElement(By locator) {
		
		
		
		return driver.findElement(locator);
		
		
		
	}

}
