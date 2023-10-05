package TestNGPackage;
/*Google Launch Program with @Test annotation*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment94 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
public void testcase1()
{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		
			driver.quit();
	}
}
