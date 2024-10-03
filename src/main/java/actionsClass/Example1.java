package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		RightContextClick();

	}

	public static void RightContextClick() throws InterruptedException {

		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		//action.contextClick().perform();  //this will do right click as per cursor on the page 
		
	    action.contextClick(e).contextClick().build().perform(); //RightClick on actual WebElement
	    Thread.sleep(3000);
	    
	    List<WebElement> options=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
	    System.out.println(options.size());
	    
	    for(WebElement i : options) {
	    	
	    	String text=i.getText();
	    	System.out.println(text);
	    	if(text.equals("Edit")) {
	    		
	    		i.click();
	    		Thread.sleep(3000);
	    		break;
	    		
	    }
	    
	    
	    	
	    	
	    }
	    
	    
	    
	    driver.quit();
		
		
		
	}

}
