package Java;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.ie.InternetExplorerDriver; 
 
public class StmTest {
 
         public static void main(String [] args) throws InterruptedException{
                  //System.setProperty("webdriver.ie.driver",path of executable file "IEDriverServer.exe")
                  System.setProperty("webdriver.ie.driver","/home/mookappa/eclipse-workspace/Selenium11/soft/IEDriverServer_x64_3.14.0/IEDriverServer");
                  //Initialize InternetExplorerDriver Instance.
                  WebDriver driver = new InternetExplorerDriver();
                  driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
                  System.out.println("Selenium Webdriver Script in Internet Explorer browser | Software Testing Material");
                  driver.close();
           }
}