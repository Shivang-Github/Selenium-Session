package xpathsCSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSEExample1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);

		//Links();
		footerLinks();

	}

	public static void InputFields() throws InterruptedException {

		// By css=By.cssSelector("[name='search']");
		// By css=By.cssSelector("[name='search'][placeholder^='S']"); //starts-with e.g
		// By css=By.cssSelector("[name='search'][placeholder$='rch']"); //ends-with e.g
		By css = By.cssSelector("[name='search'][placeholder*='rch']"); // contains
		WebElement inputEle = driver.findElement(css);
		inputEle.sendKeys("testing is progress");
		Thread.sleep(2000);
		String ele = inputEle.getAttribute("value");
		System.out.println(ele);
		driver.quit();

	}

	public static void Links() throws InterruptedException {
		// By
		// rightSideLink=By.cssSelector("[href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'].list-group-item");
		By rightLinks = By.cssSelector("#column-right > .list-group>a");

		// driver.findElement(rightSideLink).click();
		List<WebElement> totalLinks = driver.findElements(rightLinks);
		System.out.println("total available links =" + totalLinks.size());

		for (WebElement e : totalLinks) {

			String text = e.getText();
			System.out.println(text);

		}

	}
	public static void footerLinks() {
		
		By footerLink=By.cssSelector(".row >.col-sm-3>ul>li");
		List<WebElement> Allfooters=driver.findElements(footerLink);
		
		System.out.println("total no of footerLinks ="  + Allfooters.size());
		
		for(int i=0;  i<Allfooters.size(); i++ ) {
			
			String text=Allfooters.get(i).getText();
			System.out.println(text);
		}
		
		//Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    driver.close();
	}
	

}
