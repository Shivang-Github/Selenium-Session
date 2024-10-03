package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	//perform() is mandatory
	

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		By source=By.id(null);
		By target=By.id(null);
		
		
		Actions act =new Actions(driver);
		
		
		Action dragAndDrop=act.clickAndHold(driver.findElement(source)).moveToElement(driver.findElement(target)).release()
		   .build();
		
		dragAndDrop.perform();
		
		
	}

}
