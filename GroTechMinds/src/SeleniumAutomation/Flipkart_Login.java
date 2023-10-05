package SeleniumAutomation;
//Launch Flipkart from guest mode and enter mobile number ,click request OTP and close login popup using relative xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mobileno=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobileno.sendKeys("vinuthad70@gmail.com");
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
		Thread.sleep(2000);
		WebElement clickX=driver.findElement(By.xpath("//button[.='✕']"));
		clickX.click();
		driver.close();
	}

}
