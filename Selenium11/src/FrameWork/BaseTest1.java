package FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.Table.Cell;

public class BaseTest1 {
	public WebDriver driver;
 static
	{
	 System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
	}
 @BeforeClass
 public void openApp()
 {
	 driver=new ChromeDriver();
	 driver.get("https://en-gb.facebook.com/login/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 
 }
 public static String readExcel(String Sheet1,int i ,int j) throws IOException, Exception, InvalidFormatException {
	 FileInputStream fis=new FileInputStream("./Excel/myExcel.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	 Sheet s=wb.getSheet(Sheet1);
	 Row r=s.getRow(i);
	 org.apache.poi.ss.usermodel.Cell c = r.getCell(j);
	 String data=c.toString();
	return data;
	 
 }
 @AfterMethod
 public void postCondtion(ITestResult res)
 {
if(res.getStatus()==ITestResult.FAILURE)
{
		TakesScreenshot shots=(TakesScreenshot)driver;
		File srcFile=shots.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./ScreenShots.png");
		try {

			FileHandler.copy(srcFile, destFile);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
       }

 }
 
 @AfterClass
 public void closeApp()
 {
	 driver.close();
 	
 }
 
 public static void verifyThePage(WebDriver driver,String expected,String subString)
 {
	 WebDriverWait wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.titleContains(subString));
	 String actual=driver.getTitle();
	 Assert.assertEquals(actual, expected);
	 
 }

}
