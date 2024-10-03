package sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);

		//GSearchResult();
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li/div//div[@class='wM6W7d']");
		By multiSuggest=By.xpath("");
		
		
		
		doSearch(searchField,"naveen",suggestions,"Jindal");
		
		driver.quit();
		

	}

	// now create a generic function

	public static void doSearch(By searchField, String searchKey,By suggestions,String matchValue) {

		driver.findElement(searchField).sendKeys(searchKey);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> suggList = driver.findElements(suggestions);
		
		int totalSuggestion = suggList.size();
		System.out.println(totalSuggestion);

		for (WebElement e : suggList) {

			String allSuggestedNames = e.getText();
			System.out.println(allSuggestedNames);
			if (allSuggestedNames.contains(matchValue)) {

				e.click(); // e is having webelement click operation perform only here right not on
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		// allSuggestedNames
				
				break;

			}
		}
		

	}

	public static void GSearchResult() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);

		// input value id and name both locators are working fine
		// driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);

		// now lot of suggestion comes that store in a list
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul/li/div//div[@class='wM6W7d']"));

		int totalSuggestion = suggestion.size();
		System.out.println(totalSuggestion);

		for (WebElement e : suggestion) {

			String allSuggestedNames = e.getText();
			System.out.println(allSuggestedNames);
			if (allSuggestedNames.contains("tutorial")) {

				e.click(); // e is having webelement click operation perform only here right not on
							// allSuggestedNames
				Thread.sleep(3000);
				break;

			}
		}

		driver.quit();

	}

}
