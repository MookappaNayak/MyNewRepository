package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parallel {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
		
		
		
	}
@Parameters({"browser"})
@BeforeClass
public void openApp(String browser) 
{
	if(browser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	driver.get("https://www.guru9.com");
	
}
}
