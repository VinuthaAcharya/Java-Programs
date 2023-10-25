package amazon.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon.src.AddToCart_Page;
import amazon.src.Home_Page;
import amazon.src.Login_Page;
import amazon.src.Whishlist_Page;
import datasheet.Exceldata;

public class TestCase4 extends Launch
{
	@Test
	public void tc4() throws EncryptedDocumentException, IOException, InterruptedException
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
	Set<String> parentchild=driver.getWindowHandles();
	Iterator<String> pc=parentchild.iterator()	;
	String pid=pc.next();
	String cid=pc.next();//child id
	driver.switchTo().window(cid);
	Thread.sleep(2000);
	AddToCart_Page a4=new AddToCart_Page(driver);
	a4.atc();
	a4.cart();
	}
}
