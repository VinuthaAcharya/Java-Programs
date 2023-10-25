package amazon.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon.src.Home_Page;
import amazon.src.Login_Page;
import amazon.src.Whishlist_Page;
import datasheet.Exceldata;

public class TestCase3 extends Launch
{
	@Test
	public void tc3() throws EncryptedDocumentException, IOException
	{
	Login_Page a1=new Login_Page(driver);
	Exceldata.readexcel();
	a1.un();
	a1.continuebutton();
	a1.pwd();
	a1.login();	
	Home_Page a2=new Home_Page(driver);
	a2.search();
	Whishlist_Page a3=new Whishlist_Page(driver);
	a3.selectshoe();
	}
}
