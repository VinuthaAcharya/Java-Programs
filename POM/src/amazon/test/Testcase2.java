package amazon.test;

import org.testng.annotations.Test;

import amazon.source.Amazon_Home;
import amazon.source.Amazon_Login;

public class Testcase2 extends Launch_Quit
{
	@Test
	public void search_shoe()
	{
		Amazon_Login a1=new Amazon_Login(driver);
		a1.un();
		a1.continuebutton();
		a1.pwd();
		a1.login();
		Amazon_Home a2=new Amazon_Home(driver);
		a2.search();
	}
}
