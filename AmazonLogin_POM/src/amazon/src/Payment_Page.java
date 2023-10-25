package amazon.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement creditcard;
		
	public void cc()
	{
		creditcard.click();
	}
		
	public Payment_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
