package amazon.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon.src.Login_Page;
import datasheet.Exceldata;

public class TestCase1 extends Launch
{	
	@Test
	public void tc1() throws EncryptedDocumentException, IOException
	{
	
		Login_Page a1=new Login_Page(driver);//initialize your elements ->Constructor
		Exceldata.readexcel();
		a1.un();
		a1.continuebutton();
		a1.pwd();
		a1.login();	
	}
}
