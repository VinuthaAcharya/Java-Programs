package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FL_WebElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("(//input)[3]"));
		username.sendKeys("vinuthad70@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tanu@123");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
	}

}
