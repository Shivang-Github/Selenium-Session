package xpathsCSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		System.out.println("title of the page" + driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("television");
		Thread.sleep(2000);
		List <WebElement> eleList=driver.findElements(By.cssSelector("#nav-flyout-searchAjax div li"));
		System.out.println(eleList.size());
		
		for(WebElement e: eleList) {
			
			
			String text=e.getText();
			System.out.println(text);
			if(text.contains("23")) {
				
				e.click();
				break;
				
				
			}
		}
		
		
		driver.quit();
		

	}
	
	
	
	
	
	
	
	
	

}
