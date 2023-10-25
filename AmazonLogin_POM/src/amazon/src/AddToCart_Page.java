package amazon.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datasheet.Exceldata;

public class AddToCart_Page extends Exceldata
{

	WebDriver driver;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	@FindBy(id="nav-cart-count")
	WebElement cartlink;
	
	public void atc()
	{
		addtocart.click();
	}
	public void cart()
	{
		cartlink.click();
	}
	
	public AddToCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
