package Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/uas/login?");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bye");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		
	}

}
