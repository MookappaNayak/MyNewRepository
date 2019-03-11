package GMAIL_FRAMEWORK;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import FrameWork.BaseTest1;

public class Test_Gmail_LoginPage extends BaseTest2 {
	@Test
	public void gmail_LoginPage() throws InvalidFormatException, IOException, Exception
	{
		
		
		Gmail_LoginPage g1=new Gmail_LoginPage(driver);
		String fname= BaseTest2.readExcel("Sheet1",0, 0);
		String lname= BaseTest2.readExcel("Sheet1",0, 1);
		String uname= BaseTest2.readExcel("Sheet1",0, 2);
		String p1= BaseTest2.readExcel("Sheet1",0, 3);
		String p2= BaseTest2.readExcel("Sheet1",0, 4);
		
		g1.firstName(fname);
		g1.lastName(lname);
		g1.userName(uname);
		g1.pass1(p1);
		g1.pass2(p2);
		g1.neXT();
		String expected ="gdhfgfgfhg";
		System.out.println(expected);
		BaseTest1.verifyThePage(driver,expected,"Google");
		
	}

}
