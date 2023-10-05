package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginR {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("vinuthad70@gmail.com");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Tanu@123");
		driver.findElement(By.xpath("(//button)[1]")).click();
	}

}
