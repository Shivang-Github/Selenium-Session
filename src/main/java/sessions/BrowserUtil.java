package sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	
	WebDriver driver;
	
	/**
	 * this method helps for browser initialization and its generic method
	 * @param bName
	 */
	
	public WebDriver intiBrowser(String bName) {
		
		switch(bName.trim().toLowerCase()) {
		
		case "chrome":{
			driver=new ChromeDriver();
			break;
		}
			case "edge":{
			driver=new EdgeDriver();
			break;
				
			}
			case "firefox":{
				driver=new FirefoxDriver();
				break;
				}
			case "safari":
			{
				driver=new SafariDriver();
			break;
		}
		
		default:
			throw new BrowserException("Invalid browser");
		
		}	
		return driver;
	}
	
	public void AppUrl(String URL) {
		
		driver.get(URL);
		
		
		driver.manage().window().maximize();
		System.out.println("URL launched successfully");
	}
	
	public String PageTitle() {
		
		String pTitle=driver.getTitle();
		return pTitle;
		
	}
	
	
	public void CloseBrowser() {
		
		driver.quit();
		
	}
	
	
	
	
	
	

}
