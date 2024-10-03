package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample1 {
	
	static WebDriver driver;
	static final String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

	public static void main(String[] args) {
		
	}
	
	
	public static void roughCode() {
		
		
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		By RightLinks = By.xpath("//aside[@id='column-right']/div/a");

		List<WebElement> allLinks = driver.findElements(RightLinks);
		
		int count=allLinks.size();
		if(count==0) {
			
			System.out.println("element is not presenet");
		}
		
		
		
		
	}
	
	

}
