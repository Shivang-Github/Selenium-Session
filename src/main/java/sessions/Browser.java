package sessions;

import org.openqa.selenium.edge.EdgeDriver;



public class Browser {

	public static void main(String[] args) {
		
		
		//firefox browser not available in my machine
		//RemoteWebDriver driver=new FirefoxDriver();
		//FirefoxDriver driver1=new FirefoxDriver();
		
		
		//1.ChromiumDriver is the super class of EdgeDriver and ChromeDriver class
		//2.edge browser
		//ChromiumDriver driver =new EdgeDriver();
		EdgeDriver driver=new EdgeDriver();
        		
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.in");
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		
		//validation
		if(PageTitle.equals("Google")) {
			
			
			System.out.println("page title is correct");
			
		}
		else {
			
			
			System.out.println("incorrect page title");
		}
		
		
		//driver.close();
		driver.quit();
		
		

	}

}
