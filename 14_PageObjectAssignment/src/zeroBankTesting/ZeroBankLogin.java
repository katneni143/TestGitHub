package zeroBankTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ZeroBankLogin {
	static ChromeDriver getDriver;
	
	@BeforeClass
	static void openBrowser() {
		System.setProperty("getdriver.chrome.driver", "C:\\Eclipse\\chromedriver81.exe");
		getDriver = new ChromeDriver();
	}

	@Test(priority=1, dependsOnMethods="openBrowser")
	static void navigateToURL(String strURL) {
		getDriver.navigate().to(strURL);
	}
	
	
}
