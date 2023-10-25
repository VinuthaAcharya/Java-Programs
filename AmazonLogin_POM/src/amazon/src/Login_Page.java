package amazon.src;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datasheet.Exceldata;

public class Login_Page extends Exceldata
{
	WebDriver driver;
	
	//Locating the elements
	
	@FindBy(id="ap_email")
	WebElement uname;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(name="password")
	WebElement pw;
	
	@FindBy(id="signInSubmit")
	WebElement loginbtn;
	
	//Creating each component methods
	public  void un() throws EncryptedDocumentException, IOException
	{
	
		uname.sendKeys(username);
	}
	
	public void continuebutton()
	{
		continuebtn.click();
		
	}
	
	public void pwd()
	{
		pw.sendKeys(password);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
//	Step:3 Initializing the element inside the constructor
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
