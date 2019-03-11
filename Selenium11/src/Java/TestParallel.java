package Java;
//
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//public class TestParallel extends Parallel{
//	@Test
//	public void add()
//	{
//		Reporter.log("hi",true);
//	}
//
//}
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.ie.InternetExplorerDriver;
 
import org.testng.annotations.AfterClass;
 
import org.testng.annotations.BeforeClass;
 
import org.testng.annotations.Parameters;
 
import org.testng.annotations.Test;
 
public class TestParallel {
 
 public WebDriver driver;
 
  @Parameters("browser")
  @BeforeClass
  public void beforeTest(String browser) {
  if(browser.equalsIgnoreCase("ChromeDriver")) {
   driver = new ChromeDriver();
  }else if (browser.equalsIgnoreCase("ChromeDriver")) { 
	  System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
 
   driver = new ChromeDriver();
 
  } 
  driver.get("http://www.store.demoqa.com"); 
 
  }
  @Test public void login() throws InterruptedException {
 
 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
    driver.findElement(By.id("log")).sendKeys("testuser_1");
 
    driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
    driver.findElement(By.id("login")).click();
 
 }  
 
  @AfterClass public void afterTest() {
 
 driver.quit();
 
 }
 
}