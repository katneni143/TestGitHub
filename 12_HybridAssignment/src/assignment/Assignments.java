package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import junit.framework.Assert;

public class Assignments {
	static ChromeDriver getDriver;
	Boolean exeStatus = false;
	@Test
  	public void AssertAndDataTable() throws Exception, NullPointerException {
		String appURL = null;
		String uName = null;
		String pWord = null;
		String keyWord = null;
		String objectType = null;
		FileInputStream FIS = new FileInputStream("C:\\Eclipse\\Assignment.xlsx");
		FileOutputStream FOS = new FileOutputStream(new File("C:\\Eclipse\\Assignment_Result.xlsx"));
		XSSFWorkbook wBook = new XSSFWorkbook(FIS);
		Sheet dtSheet = wBook.getSheet("DT");
		Sheet tcSheet = wBook.getSheet("TS");
		int dtRowCount = dtSheet.getLastRowNum();
		int tcRowCount = tcSheet.getLastRowNum();
		for(int dtLoopRow = 1; dtLoopRow <= dtRowCount; dtLoopRow ++) {
			appURL = dtSheet.getRow(dtLoopRow).getCell(0).getStringCellValue();
			uName = dtSheet.getRow(dtLoopRow).getCell(1).getStringCellValue();
			pWord = dtSheet.getRow(dtLoopRow).getCell(2).getStringCellValue();
			dtSheet.getRow(dtLoopRow).createCell(3).getStringCellValue();
			for (int tcLoop = 1; tcLoop <= tcRowCount; tcLoop ++) {
				keyWord = tcSheet.getRow(tcLoop).getCell(0).getStringCellValue();
				objectType = tcSheet.getRow(tcLoop).getCell(1).getStringCellValue();
				switch(keyWord.trim().toLowerCase()) {
					case "openbrowser":
						openBrowser();
						break;
					case "enterurl":
						goToURL(appURL);
						break;
					case "checkobjdisplayes":
						checkObjDisplayed(objectType);
						break;
					case "enterusername":
						enterUserName(objectType, uName);
						break;
					case "enterpassword":
						enterPassWord(objectType, pWord);
						break;
					case "click":
						click(objectType);
						break;
					case "closebrowser":
						closeBrowser();
						break;
					case "logoutuser":
						logOutUser();
						break;
				}
			}
			if(exeStatus) {
				dtSheet.getRow(dtLoopRow).createCell(3).setCellValue("Valid credentials");
			}else {
				dtSheet.getRow(dtLoopRow).createCell(3).setCellValue("InValid credentials");
			}
		}
		wBook.write(FOS);
		wBook.close();
	}
  
	
	
 //////// Open Browser
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe" );
		getDriver = new ChromeDriver();
		getDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
//////// Go To URL
	public void goToURL(String appURL) throws Exception {
		getDriver.navigate().to(appURL);
		Thread.sleep(100);
		Assert.assertEquals(getDriver.getTitle(), "OrangeHRM");
	}
//////// Check If Object Displayed
	public void checkObjDisplayed(String objProperty) throws Exception, NoSuchElementException {
		Thread.sleep(2000);
		try {
			Assert.assertTrue(getDriver.findElement(By.id(objProperty)).isDisplayed());
			exeStatus = true;
		}catch(Exception e) {
			exeStatus = false;
		}
	}
//////// Enter User Name
	public void enterUserName(String objProperty, String valueToEnter) {
		Assert.assertTrue(getDriver.findElement(By.id(objProperty)).isDisplayed());
		getDriver.findElement(By.id(objProperty)).sendKeys(valueToEnter);
		Assert.assertEquals(getDriver.findElement(By.id(objProperty)).getAttribute("value").toLowerCase(), valueToEnter.toLowerCase());
	}
////////Enter Password
	public void enterPassWord(String objProperty, String valueToEnter) {
		Assert.assertTrue(getDriver.findElement(By.id(objProperty)).isDisplayed());
		getDriver.findElement(By.id(objProperty)).sendKeys(valueToEnter);
		Assert.assertEquals(getDriver.findElement(By.id(objProperty)).getAttribute("value").toLowerCase(), valueToEnter.toLowerCase());
	}
//////// Click On Object
	public void click(String objProperty) {
		Assert.assertTrue(getDriver.findElement(By.id(objProperty)).isDisplayed());
		getDriver.findElement(By.id(objProperty)).click();
	}
//////// Logout User
	public void logOutUser() throws NoSuchElementException, Exception{
		if(exeStatus) {
			Thread.sleep(3000);
			Assert.assertTrue(getDriver.findElement(By.id("welcome")).isDisplayed());
			getDriver.findElement(By.id("welcome")).click();
			Thread.sleep(100);
			getDriver.findElement(By.xpath("//a[text() = 'Logout']")).click();
		}
	}
//////// Close Browser
	public void closeBrowser() {
		getDriver.close();
	}
	
}
