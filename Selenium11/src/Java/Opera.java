package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {
	public static void main(String[] args) {
		 System.setProperty("webdriver.opera.driver","/home/mookappa/Downloads/operadriver_linux64/operadriver");
	      WebDriver  driver=new OperaDriver();
	        driver.manage().window().maximize();
	}

}
