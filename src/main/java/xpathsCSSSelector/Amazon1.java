package xpathsCSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		System.out.println("title of the page" + driver.getTitle());
		
		Thread.sleep(4000);
		
		By nextSlide=By.xpath("//span[text()='Next slide']");
		By backSlide=By.xpath("//i[@class='a-icon a-icon-previous-rounded']");
		
		//By backSlide=By.xpath("//span[text()='Previous slide']");
		
		driver.findElement(nextSlide).click();
		Thread.sleep(4000);
		driver.findElement(backSlide).click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
