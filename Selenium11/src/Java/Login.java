package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@BeforeMethod
	public void on()
	{
		System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.guru99.com");
			
	}

	@Test
	public void open()
	{
		Reporter.log("hi",true);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
