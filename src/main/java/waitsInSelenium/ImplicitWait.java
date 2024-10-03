package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		driver.findElement(By.xpath("//div[text()='Login']")).click();

		Duration totalTime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(totalTime);

		driver.close();

	}

}
