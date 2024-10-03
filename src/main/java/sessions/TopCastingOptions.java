package sessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//this is valid topcasting but there is no use only 2 method we can acccess.
		SearchContext s=new ChromeDriver();

		s.findElement(null);
		s.findElements(null);
		
		//2.
		
		RemoteWebDriver rd=new ChromeDriver(); 
		
		//3. this topcasting is also  but this remoteclass
		
		//WebDriver d=new RemoteWebDriver();
		
		//4.valid but scope till chrome and edge browser we can use for other browser.
		ChromiumDriver obj=new ChromeDriver();
		
		
		
		
		
		
	}

}
