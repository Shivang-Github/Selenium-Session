package chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrme {
	
	static WebDriver driver;
	
	public static void main(String []args) {
	
	
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--headless");  //this is the argument need to remember
	
	//co.addArguments("--headless", "--incognito");
	
	
	
	 driver=new ChromeDriver(co);
	 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
     System.out.println(driver.getTitle());
     
     driver.findElement(By.linkText("Login")).click();
     System.out.println(driver.getTitle());
     
     
     driver.quit();

	 
	 
	}

}
