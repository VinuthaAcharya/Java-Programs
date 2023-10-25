package amazon.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazon.src.Home_Page;
import amazon.src.Login_Page;
import datasheet.Exceldata;

public class TestCase2 extends Launch 
{
	@Test
	public void tc2() throws EncryptedDocumentException, IOException
	{
	Login_Page a1=new Login_Page(driver);
	Exceldata.readexcel();
	a1.un();
	a1.continuebutton();
	a1.pwd();
	a1.login();	
	Home_Page a2=new Home_Page(driver);
	a2.search();
	}
}
