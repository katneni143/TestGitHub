package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assignment {
	static ChromeDriver getDriver;	
	public static void main(String[] args) throws IOException {
		String appURL = null;
		String uName = null;
		String pWord = null;
		String exeStatus = null;
		String keyWord = null;
		String objectType = null;
		String dtData = null;
		
		FileInputStream FIS = new FileInputStream("C:\\Eclipse\\Assignment.xlsx");
		FileOutputStream FOS = new FileOutputStream(new File("C:\\Eclipse\\AssignmentResult.xlsx"));
		XSSFWorkbook wBook = new XSSFWorkbook(FIS);
		Sheet dtSheet = wBook.getSheet("DT");
		Sheet tcSheet = wBook.getSheet("TS");
		int dtRowCount = dtSheet.getLastRowNum();
		int tcRowCount = tcSheet.getLastRowNum();
		for(int dtLoopRow = 1; dtLoopRow <= dtRowCount; dtLoopRow ++) {
			appURL = dtSheet.getRow(dtLoopRow).getCell(0).getStringCellValue();
			uName = dtSheet.getRow(dtLoopRow).getCell(1).getStringCellValue();
			pWord = dtSheet.getRow(dtLoopRow).getCell(2).getStringCellValue();
			exeStatus = dtSheet.getRow(dtLoopRow).createCell(3).getStringCellValue();
			for (int tcLoop = 1; tcLoop <= tcRowCount; tcLoop ++) {
				keyWord = tcSheet.getRow(tcLoop).getCell(0).getStringCellValue();
				objectType = tcSheet.getRow(tcLoop).getCell(1).getStringCellValue();
				
				System.out.println(keyWord + " = "+ objectType + " = "+ dtData);
			}
		}
	}
	
	public void openBrowser() {
		System.getProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe");
		getDriver = new ChromeDriver();
		getDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	public void goToURL(String appURL) throws Exception {
		getDriver.navigate().to(appURL);
		Thread.sleep(100);
		Assert.assertEquals(getDriver.getTitle(), "OrangeHRM");
	}
	
	public void checkObjDisplayed(String objProperty) {
		Assert.assertEquals(getDriver.findElement(By.name(objProperty)).isDisplayed(), true);
	}
}

