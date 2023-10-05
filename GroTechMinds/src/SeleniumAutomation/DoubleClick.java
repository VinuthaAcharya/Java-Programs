package SeleniumAutomation;
/*"How to do the double click on any element?
Use Actions class and doubleClick () method"*/
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		Actions a=new Actions(driver);
		a.doubleClick(mob).perform();	
	}

}
