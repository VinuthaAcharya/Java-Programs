package SeleniumAutomation;
//Try to login Amazon.in then click on mobiles tab by using Linktext locator.	
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_AL 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
		driver.close();
	}

}
