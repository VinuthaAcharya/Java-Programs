package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Grotechminds 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("1"));
		username.sendKeys("Vinutha");
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys(Keys.CONTROL+"v");
		WebElement hint=driver.findElement(By.id("2"));
		hint.sendKeys(Keys.CONTROL+"v");
		WebElement firstname=driver.findElement(By.name("text-397"));
		firstname.sendKeys(Keys.CONTROL+"v");
		WebElement lastname=driver.findElement(By.id("5"));
		lastname.sendKeys(Keys.CONTROL+"v");		
		
		
	}

}
