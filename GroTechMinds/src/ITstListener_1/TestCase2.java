package ITstListener_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 
{
	 public ChromeDriver driver;
	 @BeforeMethod
	 public void launch()
		{
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}	
	@Test
	public void senerio2()
	{
		WebElement search=driver.findElement(By.name("q"));
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	
}
