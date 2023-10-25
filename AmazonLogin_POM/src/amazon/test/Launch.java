package amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch 
{
	WebDriver driver;
	@BeforeMethod()
	public void amazonurl()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
	}
	@AfterMethod
	public void browserquit()
	{
	//	driver.close();
	}
	
}
