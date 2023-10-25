package amazon.src;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datasheet.Exceldata;

public class Home_Page extends Exceldata
{
	Exceldata edata=new Exceldata();
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	public void search() throws EncryptedDocumentException, IOException
	{
		edata.readexcel();
		search_tf.sendKeys(edata.searchitem);
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
