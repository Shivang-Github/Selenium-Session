package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		//BrowserUtil obj=new BrowserUtil();
		//obj.intiBrowser("chrome");
		//obj.AppUrl("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11510680319938778972%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9198209%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&prevRID=F4D70AG1QB7F9EZPPP6B&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String pgeTitle=driver.getTitle();
		if(pgeTitle.equals("Register Account")) {
			
			System.out.println("this is the corect page");	
		}
		else {
			
			
			System.out.println("Not a coorect page");
		}
		Thread.sleep(4000);
		By clickhere=By.linkText("login page");
		By register=By.linkText("Register");
		By email=By.id("input-email");
		By rdiobtn=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		doClick(rdiobtn);
		//doClick(clickhere);
		//doSendkeys(email,"acd@xyz.com");
		Thread.sleep(4000);
		//doClick(register);
		//driver.findElement(By.linkText("login page")).click();
		Thread.sleep(4000);
		driver.close();
		
		//find all the locators
		
		By firstname=By.xpath("//input[@name='firstname']");
		By lastname=By.id("input-lastname");
		//By email=By.id("input-email");
		By telephone=By.name("telephone");
		
		//1.
		driver.findElement(By.id("firstname")).sendKeys("abcd");
		driver.findElement(By.id("lastname")).sendKeys("abcd");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("telephone")).sendKeys("abcd");
		
		
		
		driver.quit();
	
	}
	
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doClick(By locator) {

		getElement(locator).click();

	}

	public static void doSendkeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}


	
	

}
