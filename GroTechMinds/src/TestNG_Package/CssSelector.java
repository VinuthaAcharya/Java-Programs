package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector 
{
@Test
public void launch()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#email)")).sendKeys("vinuthad70@gmail.com");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("Tanu@123");
	driver.findElement(By.xpath("(//button)[1]")).click();

}
}
