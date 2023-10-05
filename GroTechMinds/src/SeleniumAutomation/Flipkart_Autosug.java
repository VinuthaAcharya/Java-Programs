package SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosug 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Shoe");
		Thread.sleep(1000);
		List<WebElement> autos=driver.findElements(By.xpath("//form[@class='_2M8cLY header-form-search']/ul/li"));
		int count=autos.size();
		Thread.sleep(1000);
		System.out.println(count);
		autos.get(2).click();
		Thread.sleep(1000);
		driver.close();
	}

}
