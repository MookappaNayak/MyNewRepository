package Java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","/home/mookappa/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/uas/login?");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		TakesScreenshot shots=(TakesScreenshot)driver;
		File srcFile=shots.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./ScreenShots.png");
		FileHandler.copy(srcFile, destFile);
		driver.close();
	}

}
