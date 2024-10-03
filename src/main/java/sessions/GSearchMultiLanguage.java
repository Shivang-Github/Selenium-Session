package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSearchMultiLanguage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//link text is not working for google language link that why we have written below logic and
		// click on the particular links

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	

		driver.get("https://www.google.com/");
		A();
		By language = By.xpath("//div[@id='SIvCob']/a");

		List<WebElement> allLanguageLinks = getElements(language);

		for (WebElement e : allLanguageLinks) {

			String text = e.getText();
			System.out.println(text);
			if(text.contains("ಕನ್ನಡ")) {
				
				e.click();
				System.out.println("click successfully");
				break;
			}

		}

		driver.quit();
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}
	
	
	public static void A() throws InterruptedException {
		
		//this xpath is not working that why we have handle link in that way
		String link="https://www.google.com/setprefs?sig=0_zZ0XnqU7ZcaZyHdbaaRhGVfoGM4%3D&amp;hl=hi&amp;source=homepage&amp;sa=X&amp;ved=0ahUKEwjg18_wr9aHAxU0q5UCHTgANygQ2ZgBCBg";
		
		driver.findElement(By.linkText(link)).click();
		System.out.println("click successfully");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	
	
	
	

}
