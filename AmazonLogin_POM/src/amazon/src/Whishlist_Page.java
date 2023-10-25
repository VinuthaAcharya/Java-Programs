package amazon.src;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whishlist_Page 
{
	WebDriver driver;
	
	//Locating the elements
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[2]")
	WebElement selectedshoe;
	
	//Creating each component methods
	public void selectshoe() throws EncryptedDocumentException, IOException
	{
		selectedshoe.click();
	}
		
//	Step:3 Initializing the element inside the constructor
	public Whishlist_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
