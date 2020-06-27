package newTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenNewTabAndSwitch { 
	/*
	 * Class Name:- Root  :: java.awt Package
	 * access your keyboard
	 * after key press then release key
	 * keys to open a new tab "Ctrl + N"
	 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe" );
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		chrome.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		Robot openTab = new Robot();
		openTab.keyPress(KeyEvent.VK_CONTROL);
		openTab.keyPress(KeyEvent.VK_T);
		openTab.keyRelease(KeyEvent.VK_CONTROL);
		openTab.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);

// Switch between two TABS
		List<String> listTab = new ArrayList(chrome.getWindowHandles());
		chrome.switchTo().window(listTab.get(1));
		
// Switch between two Frames
		chrome.get("http://www.londonfreelance.org/courses/frames/");
		chrome.switchTo().frame("navbar");
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Sample content")).click();
		
		chrome.switchTo().defaultContent();
		chrome.switchTo().frame("navbar");
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Home")).click();
		
	}

}
