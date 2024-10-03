package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseMover {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		MouseMovers();

	}

	public static void MouseMovers() throws InterruptedException {

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement Login = driver.findElement(By.cssSelector("[title='Login']>img~span"));
		action.moveToElement(Login).perform();

		//driver.findElement(By.xpath("//*[text()='My Profile']")).click();

		By list = By.xpath("//ul[@class='_3YjYK7 ecs1XG']/a/li//img");

		IterateList(list, "Rewards");

		// 2.action.moveToElement(Login, -20, -10).build().perform();

		// Where to use ask Naveen and how it works ?

		// 3.Action obj=action.moveByOffset(100, 200).build();
		// System.out.println(obj);

		// action.moveToLocation(50,1000).perform();

		// move target out of bounds exception - ask naveen for this

		Thread.sleep(3000);

		driver.quit();

	}
	
	public static void FlipkartMouseMovr() throws InterruptedException {
		
		

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='Gift Cards']"));
		act.scrollToElement(e).pause(1000).perform();
		e.click();		
		Thread.sleep(3000);
		
		//GiftCardStore Page
		String titleP=driver.getTitle();
		System.out.println(titleP);
		Thread.sleep(3000);
		
		WebElement MMElement=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		act.moveToElement(MMElement).perform();
		Thread.sleep(4000);
		
		By list=By.xpath("//div[@class='jzpKY6']/div/a");
		List<WebElement> Shoppinglist=driver.findElements(list);
		System.out.println(Shoppinglist.size());
		
		for(WebElement j: Shoppinglist) {
			
			String text=j.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("lens")) {
				
				j.click();
				break;
			}
			
		}
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("(//div[@id='container']//h1)[position()=1]")).getText());
		
		act.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	

	public static void IterateList(By locator, String Comparetext) throws InterruptedException {

		List<WebElement> options = driver.findElements(locator);
		System.out.println(options.size());

		for (WebElement i : options) {

			String text = i.getText();
			System.out.println(text);
			if (text.equals(Comparetext)) {

				i.click();
				Thread.sleep(3000);
				break;

			}

		}

	}
}
