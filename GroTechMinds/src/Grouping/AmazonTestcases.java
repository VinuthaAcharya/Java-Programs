package Grouping;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestcases 
{
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest(groups= {"System"})
	public void testURL()
	{
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
	}
	@Test(groups= {"System"})
	public void ClickOnsignin()
	{
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		String title=driver.getTitle();
		wt.until(ExpectedConditions.titleIs(title));
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
	}
	@Test(groups= {"System"})
	public void CheckUsername()
	{
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("917045170762");
		WebElement continuebtn=driver.findElement(By.id("continue"));
		continuebtn.click();
	}
	@Test(groups= {"System"})
	public void CheckPassword()
	{
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("Tanu@123");
		WebElement signinbtn=driver.findElement(By.id("signInSubmit"));
		signinbtn.click();
	}
	@Test(groups= {"System"})
	public void SearchShoe()
	{
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoe");
		searchbox.sendKeys(Keys.ENTER);
	}
	@Test(groups= {"System"})
	public void Clickfirstshoe() throws InterruptedException
	{
		WebElement firstshoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		Thread.sleep(2000);
		firstshoe.click();
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
