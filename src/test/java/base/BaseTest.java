package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

 public class BaseTest {

	public WebDriver driver;

	@BeforeTest
	public void Setup(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:

		}

	}

	@AfterTest
	public void TearDown() {

		driver.quit();
	}

}
