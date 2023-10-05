package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled_1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/JSAM.html");
		driver.manage().window().maximize();
		WebElement lname=driver.findElement(By.id("121"));
		boolean l=lname.isEnabled();
		System.out.println(l);
		if(l==true)
		{
			lname.sendKeys("Acharya")	;
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
	}

}
