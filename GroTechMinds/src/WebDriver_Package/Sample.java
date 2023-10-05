package WebDriver_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample 
{
	WebDriver driver;
@Test
public void chrome()
{
	driver=new ChromeDriver();//Upcasting
	driver.get("http://www.google.com/");
}
@Test
public void edge()
{
	driver=new EdgeDriver();//Upcasting
	driver.get("http://www.google.com/");
}
@Test
public void Firefox()
{
	driver=new FirefoxDriver();//Upcasting
	driver.get("http://www.google.com/");
}
@Test
public void Testcase1()
{
	driver=new ChromeDriver();//Upcasting
	driver.get("http://www.google.com/");
}
}
