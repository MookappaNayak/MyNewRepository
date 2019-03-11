package GMAIL_FRAMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_LoginPage {
	//decleration
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement fTB;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lTB;
	@FindBy(xpath="//input[@id='username']")
	private WebElement uTB;
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement pTb1;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement pTb2;
	@FindBy(xpath="//span[.='Next']")
	private WebElement nBTN;
	
	
	public Gmail_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//initialization
	public void firstName(String fn)
	{
		fTB.sendKeys(fn);
	}
	public void lastName(String ln)
	{
		lTB.sendKeys(ln);
	}
	public void userName(String un)
	{
		uTB.sendKeys(un);
	}
	public void pass1(String pwd1)
	{
		pTb1.sendKeys(pwd1);
	}
	public void pass2(String pwd2)
	{
		pTb2.sendKeys(pwd2);
	}
	public void neXT()
	{
		nBTN.click();
	}

}
