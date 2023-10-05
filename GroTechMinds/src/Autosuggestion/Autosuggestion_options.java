package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion_options {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Google"));
		w1.until(ExpectedConditions.titleContains(""));
		WebElement searchtextfield=driver.findElement(By.name("q"));
		
		searchtextfield.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofauto=autosuggestion.size();
		System.out.println(countofauto);
		for(int i=0;i<countofauto;i++)
		{
			WebElement autoOptions=autosuggestion.get(i);
			String a=autoOptions.getText();
			System.out.println(a);
		}
	}

}
