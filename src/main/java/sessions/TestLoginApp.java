package sessions;

public class TestLoginApp {

	public static void main(String[] args) {

		BrowserUtil bwr = new BrowserUtil();
		bwr.intiBrowser("chrome");
		bwr.AppUrl("https://www.google.com");
		String t = bwr.PageTitle();
		if (t.equals("google")) {

			System.out.println("page title is correct");
		}
		else {
			
			System.out.println("incorrect page title");
			
			
		}
		System.out.println(t);
		bwr.CloseBrowser();

	}

}
