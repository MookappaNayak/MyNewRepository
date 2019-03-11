package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LinkedIN_Login
{
	@FindBy(xpath="//input[@id='username']")
	private WebElement unTB;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pTB;
	
	@FindBy(xpath="//button[.='Sign in']")
	private WebElement Btn;

	public LinkedIN_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void uSERNAME(String un)
	{
		unTB.sendKeys(un);
	}
	public void pass(String pwd)
	{
		pTB.sendKeys(pwd);
	}
	public void loginB()
	{
		Btn.click();
	}
}
