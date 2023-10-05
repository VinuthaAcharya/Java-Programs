package TestNGPackage;
//For 5 countries use @Test annotation
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_Launch {

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
	@Test
	public void testcase2()
	{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Korea");
			search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase3()
	{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("America");
			search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase4()
	{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Japan");
			search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase5()
	{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Ma");
			search.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		
			driver.quit();
	}
}
