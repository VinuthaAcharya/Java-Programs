package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
