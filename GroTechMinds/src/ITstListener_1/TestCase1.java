package ITstListener_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)
public class TestCase1 
{
	ChromeDriver driver=new ChromeDriver();
	WebElement search;
	@BeforeMethod
	public void launch()
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		search=driver.findElement(By.name("q"));
	}	
	@Test
	public void senerio1()
	{		
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void senerio2()
	{
		
		boolean a=search.isEnabled();
		if(a=false)
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
}
