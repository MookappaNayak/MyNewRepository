package Generics;

import org.testng.annotations.Test;

public class Test_LikeedIN_Login extends BaseTest {
@Test
public void likeedIN_Login()
{
	LinkedIN_Login l1=new LinkedIN_Login(driver);
	l1.uSERNAME("mookappa");
	l1.pass("bhehheh");
	l1.loginB();
	}
}
