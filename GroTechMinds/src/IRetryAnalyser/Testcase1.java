package IRetryAnalyser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testcase1 
{
	@Test(retryAnalyzer=IRetryAnalyser.Retry_logic.class)
	public void sample() throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.findElement(By.id("vinutha")).sendKeys("Shoe");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
	Thread.sleep(2000);
	}
}
