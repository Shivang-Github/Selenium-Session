package sessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


	 public class BrowserLogin{
	 
	 
	 

	public static void main(String[] args) throws Exception {

		WebDriver driver = null;

		String bName = "NAVEEN";

		switch (bName.trim().toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			System.out.println("chrome browser intialized");
			break;

		case "edge":
			driver = new EdgeDriver();
			System.out.println("edge browser intialized");
			break;

		default:
			System.out.println("invalid browser");
			throw new BrowserException("INVALID BROWSER");
		// break;
		}
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.close();

	}

}
