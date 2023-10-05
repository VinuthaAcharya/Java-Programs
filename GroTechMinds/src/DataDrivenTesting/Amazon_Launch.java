package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amazon_Launch extends LoginData
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		exceldata();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys(username);
		
		WebElement continuebtn=driver.findElement(By.id("continue"));
		continuebtn.click();
		
		WebElement pw=driver.findElement(By.id("ap_password"));
		pw.sendKeys(password);
		
		WebElement signinbtn=driver.findElement(By.id("signInSubmit"));
		signinbtn.click();
		
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
