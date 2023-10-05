package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchtf=driver.findElement(By.id("twotabsearchtextbox"));	
		searchtf.sendKeys("Shoe");
		Thread.sleep(1000);
		List<WebElement> autos=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=autos.size();
		System.out.println(count);
		autos.get(count-4).click();
		
		
	}

}
