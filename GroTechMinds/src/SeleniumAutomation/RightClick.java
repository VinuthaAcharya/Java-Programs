package SeleniumAutomation;
/*"How to do right click anywhere in the website?
Use - contextClick ();  method"*/
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		Actions a=new Actions(driver);
		a.contextClick(mob).perform();
		
	}

}
