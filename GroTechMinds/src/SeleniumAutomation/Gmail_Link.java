package SeleniumAutomation;
//Open any browser, then navigate to Google.com .Click on Gmail tab by using Linktext locator.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Link 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	}

}
