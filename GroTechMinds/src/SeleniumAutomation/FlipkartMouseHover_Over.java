package SeleniumAutomation;
//Launch flipkart.com hoverover Fashion and click on Mens Casual Shirts
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover_Over 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement fashion=driver.findElement(By.xpath("//div[.='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(1000);
		WebElement mensshirt=driver.findElement(By.xpath("//div[@class='_3XS_gI']/a[3]"));
		mensshirt.click();
	}

}
