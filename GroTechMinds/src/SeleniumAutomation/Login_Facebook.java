package SeleniumAutomation;
//Try to login facebook by using id and name Locator .
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook 
{

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.id("email")).sendKeys("vinuthad70@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Tanu@123");
		d.findElement(By.name("login")).click();
		d.close();
	}

}
