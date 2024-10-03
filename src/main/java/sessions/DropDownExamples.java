package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	static WebDriver driver;
	static final String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

	public static void main(String[] args) throws InterruptedException {
		launchApplication();
		// example1();
		// example2();
		By MindropDown = By
				.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/section[2]/div[4]/div[1]/select");

		int totalSize=getDropDownOptionList(MindropDown);
		System.out.println(totalSize);
		// selectDropDownbyText(MindropDown,"₹20000");
		// selectDropDownbyValue(MindropDown,"30000");
		selectDropDownbyIndex(MindropDown, 1);
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.quit();

	}

	// dropdown using select class when DOM having select

	public static void launchApplication() {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		driver.manage().window().maximize();

	}

	public static void example1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		driver.manage().window().maximize();
		By MindropDown = By
				.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/section[2]/div[4]/div[1]/select");
		WebElement dropDown = driver.findElement(MindropDown);

		Select select = new Select(dropDown);
		// select.deselectByVisibleText("Min");
		Thread.sleep(3000);
		// select.selectByIndex(3);
		select.selectByVisibleText("₹20000");
		Thread.sleep(3000);
		// select.selectByValue("10000");
		// Thread.sleep(3000);

		driver.quit();

	}

	public static void example2() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		driver.manage().window().maximize();
		By MindropDown = By
				.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/section[2]/div[4]/div[1]/select");
		WebElement dropDown = driver.findElement(MindropDown);

		Select select = new Select(dropDown);
		List<WebElement> allList = select.getOptions();
		System.out.println("direct printing" + allList);
		int totalSize = allList.size();
		System.out.println(totalSize);
		for (int i = 0; i <= totalSize - 1; i++) {

			String text = allList.get(i).getText();
			System.out.println(text);

		}
		driver.quit();

	}

	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
		return element;

	}

	public static void selectDropDownbyText(By locator, String text) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

	public static void selectDropDownbyValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public static void selectDropDownbyIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}
	public static int getDropDownOptionList(By locator) {
		
		
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
		
		
		
		
		
		
		
		
	}

}
