package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysWithPause {

	// VVIMP famous interview question
	
	//perform() is mandatory
	

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		By search=By.cssSelector("textarea[name=q]");
		
		doSendKeysWithPause(search,"Naveen labs",200);

		driver.quit();
	}

	public static void RawCode() {
		WebElement search = driver.findElement(By.cssSelector("textarea[name=q]"));
		Actions act = new Actions(driver);
		String s = "Naveen Automation Labs";

		char ch[] = s.toCharArray();

		// now string is converted into character
		// sendKeys takes a charsequence i.e use String.valueof()
		// charsequence is not about character, charSequence is an interface having
		// String, StringBuilder and StringBuffer

		for (char c : ch) {

			// 1.below code will enter value as character only no pause btwn entering
			// character
			// act.sendKeys(search,String.valueOf(c)).build().perform();

			// 2. for actual pause - pause() we have to use

			act.sendKeys(search, String.valueOf(c)).pause(1000).build().perform();

		}

	}

	public static void doSendKeysWithPause(By locator,String s,long pausetime) {
        Actions act = new Actions(driver); 
		char ch[]=s.toCharArray();
         
         for(char c: ch ) {
        	 
        	 act.sendKeys(getElement(locator),String.valueOf(c)).pause(pausetime).build().perform();
         }
         
         
	}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
		
	}

}
