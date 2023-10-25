package amazon.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement addressselection;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement submit;
	
	public void address()
	{
		addressselection.click();
	}
	public void submitbtn()
	{
		submit.click();
	}
	
	public Checkout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
