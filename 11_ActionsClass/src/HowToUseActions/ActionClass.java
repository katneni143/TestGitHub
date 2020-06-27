package HowToUseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
  @Test
  public void actionHowTo() throws Exception {
	  String uName = "Admin";
	  String pWord = "admin123";
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe" );
	  ChromeDriver chrome = new ChromeDriver();
	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  chrome.manage().window().maximize();
	  //chrome.get("https:opensource-demo.orangehrmlive.com/index.php/auth/login");
	  chrome.navigate().to("https:opensource-demo.orangehrmlive.com");
	  chrome.findElement(By.name("txtUsername")).sendKeys(uName);
	  chrome.findElement(By.name("txtPassword")).sendKeys(pWord);
	  chrome.findElement(By.name("Submit")).click();
	  Thread.sleep(100);
	  //System.out.println(n + " = " + s);
	  //chrome.close();
// Hover mouse over a object
	  Actions act = new Actions(chrome);
	  WebElement admin = chrome.findElement(By.linkText("Admin"));
	  act.moveToElement(admin).build().perform();
	  act.moveToElement(chrome.findElement(By.linkText("Job"))).build().perform();
// Click On a Object
	  act.click(chrome.findElement(By.linkText("Job Titles"))).perform();
	  Thread.sleep(1000);
	  chrome.navigate().back();
	  Thread.sleep(1000);
	  chrome.navigate().forward();
	  Thread.sleep(1000);
// Open New Tab
	  chrome.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
	  Actions newTab = new Actions(chrome);
	  WebElement b = chrome.findElement(By.tagName("Body"));
	  newTab.moveToElement(b).sendKeys(Keys.LEFT_CONTROL + "t").build();
	  
	  Thread.sleep(2000);
  }
}
