package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	@FindBy(xpath="//input[@id='email']")
	private WebElement eTB;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pTB;
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement lBTN;
	
	
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	 public void eMAIL(String eml)
	 {
		 eTB.sendKeys(eml);
	 }
	 public void pASSWORD(String pwd)
	 {
		 pTB.sendKeys(pwd);
	 }
	 public void loginBtn()
	 {
		 lBTN.click();
	 }
}
