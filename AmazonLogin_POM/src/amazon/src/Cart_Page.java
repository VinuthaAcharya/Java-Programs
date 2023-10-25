package amazon.src;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page 
{
	WebDriver driver;
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuy;
	
	public void ptb() throws EncryptedDocumentException, IOException
	{
		proceedtobuy.click();
	}
	
	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
