package ScreenShot;
/*Use Math.random()Method and take screenshot of all classes */
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoogleLaunch 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\Screenshot1"+Math.random()+".png");
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\"+this.getClass()+".png");
		FileUtils.copyFile(source,destination);
	
			driver.quit();
	}
}
