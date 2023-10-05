package TestNGPackage;
import java.time.Duration;

/*TestNG - Timeout Parameter
(ThreadTimeOutOfException)*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_Class 
{
	ChromeDriver driver;
		
	@Test(timeOut=2000)
	public void testcase1()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
}
