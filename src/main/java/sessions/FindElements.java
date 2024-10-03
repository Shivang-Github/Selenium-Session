package sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
		
		//allLinks();
		WebScrping();
		
		
	}
	
	
	
	
	public static void allLinks() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().refresh();
		Thread.sleep(4000);
		int count =0;		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int totalLinks=allLinks.size();
		System.out.println(totalLinks);
		
		for(WebElement e: allLinks) {
			
			if(e.getText().length()!=0) {
			System.out.println(count++ +" "+"link="+ e.getText());
		
			}
			
		}
		int totalValidLinks=count-1;
		System.out.println("total valid links on webPage" +" = " + totalValidLinks);
		int blankLinks=totalLinks-totalValidLinks;
		System.out.println(blankLinks);
		
		driver.quit();
	
		
	}
	
	public static void WebScrping() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		List<WebElement> Images=driver.findElements(By.tagName("link"));
		
		int totalImages=Images.size();
		System.out.println(totalImages);
		//System.out.println("Total Image on homePage is="+" " +totalImages );
		
		
        /*for(int i=1; i<totalImages ; i++) {
        	
        System.out.println(i);
        	
        }    */
        
        for(WebElement e: Images)
        {
        	
        
        	 String imgURl=e.getAttribute("href");
        	System.out.println(imgURl);
        	
        }
		
		driver.quit();
	}
	
	
	public static String getAttribute (By locator,String tagName)
	{
		
		List <WebElement> elements=getElements(locator);
		for(WebElement e: elements) {
			
			e.getAttribute(tagName);
			
		}
		return tagName;
		
		
	}
	public static int listSize(By locator) {
		
		List <WebElement> elements=getElements(locator);
		return elements.size();
		
	}
	
	
	
	public static List<WebElement> getElements(By locator) {
				
		
		return driver.findElements(locator);
	}

	
	
	//use these generic utility 
	
	public static void A() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		By allLinks=By.tagName("a");
		By allImages=By.tagName("img");
		
		
		
		getElements(allImages);

		
		
	}
	
	
	
	
	

}
