package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_GoogleSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchtb=driver.findElement(By.xpath("(//textarea)[1]"));
		searchtb.sendKeys("India");
		Thread.sleep(1000);
		searchtb.sendKeys(Keys.ARROW_DOWN);
		searchtb.sendKeys(Keys.ARROW_DOWN);
		searchtb.sendKeys(Keys.ARROW_DOWN);
		searchtb.sendKeys(Keys.ARROW_DOWN);
		searchtb.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtb.sendKeys(Keys.ENTER);
		driver.close();
	}

}
