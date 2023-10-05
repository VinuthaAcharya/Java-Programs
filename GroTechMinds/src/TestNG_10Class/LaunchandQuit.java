package TestNG_10Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("917045170762");
		WebElement continuebtn=driver.findElement(By.id("continue"));
		continuebtn.click();
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("Tanu@123");
		WebElement signinbtn=driver.findElement(By.id("signInSubmit"));
		signinbtn.click();
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		Thread.sleep(6000);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\Screenshot1.png");
		FileUtils.copyFile(source,destination);
			driver.quit();
	}
}
