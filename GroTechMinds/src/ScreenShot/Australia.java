package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Australia extends GoogleLaunch
{
	@Test
	public void testcase()
	{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Australia");
			search.sendKeys(Keys.ENTER);
	}
}
