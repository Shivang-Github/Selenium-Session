package chromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncognitoMode {
	
	static WebDriver driver;
	
	
	public static void main(String []args) {
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");     //this is the argument need to remember
		
		 driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	     System.out.println(driver.getTitle());
	     
	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login"))).click();
	     
	     //driver.findElement(By.tagName("Login")).click();
	     System.out.println(driver.getTitle());
	     
	     
	     driver.quit();

	}
}
