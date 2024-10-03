package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextandAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
			getText();
			getAttribute();

	}

	
	public static void getText() throws InterruptedException {
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.navigate().refresh();
		Thread.sleep(4000);
		
		String text=
		driver.
		findElement
		(By.xpath("//*[@id=\"column-right\"]/div/a[2]"))
		.getText();
		System.out.println(text);
		
		//WebElement PageLogo=driver.findElement(By.className("img-responsive"));
		//String logo=PageLogo.getText();
		//System.out.println(logo);
		
		
		driver.quit();
	}
	public static void getAttribute() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		List<WebElement> inputFields=driver.findElements(By.className("form-control"));
		System.out.println("total input fields" +"="   +inputFields.size());
		
		for(WebElement e: inputFields) {
			
			String a=e.getAttribute("placeholder");
			System.out.println(a);
		}
		
		
		
		driver.quit();
	}
	
	
}
