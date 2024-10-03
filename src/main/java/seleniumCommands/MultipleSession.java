package seleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSession {

	static WebDriver driver;

	public static void main(String[] args) {
		
		InvalidSessionID1();
		InvalidSessionID();
		// how many session started ? =4

		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.close(); // which session/browser will close-all or current one?

		// closed the 3rd browser right
		driver.getTitle();
		// driver.quit();
		driver = new ChromeDriver();

	}

	// Note: never use driver function after quit() or close() else exception will
	// be given.
	public static void InvalidSessionID() {

		driver = new ChromeDriver();
		driver.quit();
		driver.getTitle();

		// NoSuchSessionException: Session ID is null

	}

	public static void InvalidSessionID1() {

		driver = new ChromeDriver();
		driver.close();
		driver.getTitle();

		/// NoSuchSessionException: invalid Session ID 

	}

}
