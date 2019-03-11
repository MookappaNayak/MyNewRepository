package FrameWork;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class Test_FaceBookLoginPage extends BaseTest1{
	@Test
	public void faceBookLoginPage() throws InvalidFormatException, IOException, Exception {
		
		FaceBookLoginPage l1=new FaceBookLoginPage(driver);
		
		String uname= BaseTest1.readExcel("Sheet1",0, 0);

		String password= BaseTest1.readExcel("Sheet1", 0, 1);
		l1.eMAIL(uname);
		l1.pASSWORD(password);
		l1.loginBtn();
		
		String expected =driver.getTitle();
		BaseTest1.verifyThePage(driver,expected,"Facebook");

	}
}
