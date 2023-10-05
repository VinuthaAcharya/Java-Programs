package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
		WebElement tomorrowdelivery=driver.findElement(By.xpath("//span[.='Get It in 2 Days']"));
		tomorrowdelivery.click();
		Thread.sleep(4000);
		boolean selected=tomorrowdelivery.isSelected();
		System.out.println(selected);
		driver.quit();
	}

}
