package amazon.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login 
{
		WebDriver driver;
		//Locating the elements
		
		@FindBy(id="ap_email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continuebtn;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement loginbtn;
		
		//Creating each component methods
		public void un()
		{
			username.sendKeys("vinuthad70@gmail.com");
		}
		
		public void continuebutton()
		{
			continuebtn.click();
		}
		
		public void pwd()
		{
			password.sendKeys("Tanu@123");
		}
		
		public void login()
		{
			loginbtn.click();
		}
		
//		Step:3 Initializing the element inside the constructor
		public Amazon_Login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}