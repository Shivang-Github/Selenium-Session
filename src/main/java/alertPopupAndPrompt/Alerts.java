package alertPopupAndPrompt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alerts {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		
		
		
		//Alert alt=new Alert(driver.switchTo());
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		

	}

}
