package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion1 
{
	@Test
	public void test1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assertion a=new Assertion();
		a.assertEquals("Google", "Google");
		driver.findElement(By.name("q")).sendKeys("India");
	}
}
