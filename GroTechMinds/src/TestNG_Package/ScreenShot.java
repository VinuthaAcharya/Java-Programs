package TestNG_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot 
{
	@Test
	public void testcase1() throws IOException, InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("(//textarea)[1]"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\Screenshot1.png");
		FileUtils.copyFile(source,destination);
	}
}
