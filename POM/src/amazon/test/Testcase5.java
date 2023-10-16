package amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon.source.Amazon_Login;

public class Testcase5 extends Launch_Quit
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