package SeleniumAutomation;
//Try to login Amazon.in then click on searchbox,search shoe and the click on search button. Then click on first result.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();		
	}
}
