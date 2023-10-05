package SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		//s1.selectByVisibleText("Books");
		s1.selectByValue("search-alias=stripbooks");
		List<WebElement> count=s1.getOptions();
		System.out.println(count.size());
		
	}
}
