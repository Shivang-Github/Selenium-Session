package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeMethod {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.id("input-firstname")).sendKeys("shivang");
		// how to find text field on a webpage.
		List<WebElement> inputfields = driver.findElements(By.className("form-control"));
		int total = inputfields.size();
		System.out.println(total);
		for (WebElement e : inputfields) {

			// String s =e.getAttribute("placeholder");

			String s = e.getAttribute("value");

			// String s=e.getText(); //this wont return user input values it only return
			// which is available on DOM

			System.out.println(s);

		}

		driver.quit();

	}

	public static void getAttribute(By locator, String AttributeValue) {

		List<WebElement> obj = getElements(locator);
		for (WebElement e : obj) {

			String allAttribute = e.getAttribute(AttributeValue);
			System.out.println(allAttribute);

		}

	}

	public static int getElementsCount(By locator) {

		List<WebElement> count = getElements(locator);
		return count.size();

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

}
