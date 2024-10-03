package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnUserInputValue {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		getAttribute();
		

	}
	
	public static void getAttribute() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.findElement(By.id("input-firstname")).sendKeys("shivang");
		driver.findElement(By.id("input-lastname")).sendKeys("pathak");
		driver.findElement(By.id("input-email")).sendKeys("shivangpathak@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("987654321");
		driver.findElement(By.id("input-password")).sendKeys("shivang123");
		driver.findElement(By.id("input-confirm")).sendKeys("shivang123");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");
		
		
		
		List<WebElement> inputFields=driver.findElements(By.className("form-control"));
		System.out.println("total input fields" +"="   +inputFields.size());
		
		for(WebElement e: inputFields) {
			
			String a=e.getAttribute("value");
			System.out.println(a);
		}
		
		
		
		driver.quit();
	}
	

}
