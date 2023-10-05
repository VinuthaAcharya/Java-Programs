package SeleniumAutomation;
/*Try to locate each and every componet of Grotechmind registation page except Religion and resume field.
For reference the link is:""https://grotechminds.com/registration/*/
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechMinds_Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.name("your-name")).sendKeys("Tanu");
		driver.findElement(By.name("Password")).sendKeys("Tanu@123");
		driver.findElement(By.id("2")).sendKeys("Hi");
		driver.findElement(By.name("text-397")).sendKeys("Tanush");
		driver.findElement(By.id("5")).sendKeys("Acharya");		
		driver.findElement(By.name("radio-45")).click();
		driver.findElement(By.name("checkbox-833[]")).click();
		driver.findElement(By.xpath("//input[@type='submit'")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
