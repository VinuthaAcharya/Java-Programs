package SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_dropdown 
{
		public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/JSAM.html");
		driver.manage().window().maximize();
		WebElement religion=driver.findElement(By.tagName("Select"));
		Select s1=new Select(religion);
		s1.selectByIndex(1);
		List<WebElement> countofdd=s1.getOptions();
		System.out.println(countofdd.size());
	}
}
