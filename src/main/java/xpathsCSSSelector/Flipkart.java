package xpathsCSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	static WebDriver driver;
	static String  AppURL = "https://www.flipkart.com/";

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(AppURL);
		driver.manage().window().maximize();
		System.out.println("title of the page" + driver.getTitle());
		
		Thread.sleep(4000);
		
		
		//Q. last()-1 is not working and this @class is dynamic its changing every time
		
		
		By footerLink=By.xpath("((//footer/div//div[@class='_1ZMrY_']//div//div)[last()])//p[last()-1]");
		WebElement link=driver.findElement(footerLink);
		boolean isShowing=link.isDisplayed();
		System.out.println(isShowing);
		if(isShowing==true) {
		String text=link.getText();
		System.out.println(text);	
		}
		
		driver.quit();
		
		

	}

	public void A() {
		
		driver.get(AppURL);
	}
	
	
	
	
	
}
