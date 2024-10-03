package sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExamples {

	static WebDriver driver;
	static final String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

	public static void main(String[] args) throws InterruptedException {
		//FindLinks();
		
		FooterLinks();

	}

	public static void FindLinks() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		By RightLinks = By.xpath("//aside[@id='column-right']/div/a");

		List<WebElement> allLinks = driver.findElements(RightLinks);
		List<String> LinkText = new ArrayList<String>();
		int totalRightSideLinks = allLinks.size();
		System.out.println(totalRightSideLinks);
		for (int i = 0; i <= totalRightSideLinks - 1; i++) {
			String Alltext = allLinks.get(i).getText();
			System.out.println(Alltext);
			if (Alltext.equals("Transactions")) {

				boolean status = LinkText.add(Alltext);
				System.out.println(status);

			}

		}
		driver.quit();
	}

	public static void FooterLinks() {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		By footerLinks=By.xpath("//div[@class='col-sm-3']/ul[@class='list-unstyled']/li");
		List<WebElement>links=driver.findElements(footerLinks);
		System.out.println(links.size());
		for(WebElement e: links) {
			
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Site Map")) {
				
				e.click();
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String pageText=driver.findElement(By.linkText("Site Map")).getText();
				if(pageText.equals("Site Map")) {
					
					System.out.println("corect page");
				}
				break;
			}
			
		}
		driver.quit();

	}

}
