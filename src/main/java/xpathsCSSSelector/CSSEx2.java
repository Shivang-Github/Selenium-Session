package xpathsCSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CSSEx2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);

		String NonBlankHref = null;

		By href = By.cssSelector("[href]");
		List<WebElement> totalHref = driver.findElements(href);

		System.out.println("total href on webPage=" + totalHref.size());
		for (WebElement e : totalHref) {

			String values = e.getText();
			// System.out.println(values);
			if (values.length() >= 0) {

				NonBlankHref = e.getText();
				System.out.println(NonBlankHref);

			}

		}
		System.out.println("Non blank hrefs are =" + NonBlankHref.length());
		driver.quit();

	}

}
