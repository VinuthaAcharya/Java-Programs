package amazon.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.source.Amazon_Login;
@Listeners(Launch_Quit.class)

public class Testcase1 extends Launch_Quit
{	
	@Test
	public void login_in_amazon_application()
	{
		Amazon_Login a1=new Amazon_Login(driver);
		a1.un();
		a1.continuebutton();
		a1.pwd();
		a1.login();
	}
}