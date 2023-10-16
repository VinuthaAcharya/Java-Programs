package amazon.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home 
{	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	public void search()
	{
		search_tf.sendKeys("Shoe");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public Amazon_Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}