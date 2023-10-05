package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Method_3_4 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//Whenever tagname and attribute available(tagName[AN=AV])
//		WebElement search=driver.findElement(By.cssSelector("textarea[class=gLFyf]"));
//		search.sendKeys("India");
		
		//Whenever tagname ,classname and attribute available(tagName.className[AN=AV])
		driver.get("https://www.amazon.in/");
		WebElement cartcount=driver.findElement(By.cssSelector("span.nav-cart-count[id=nav-cart-count]"));
		cartcount.click();
		
	}

}
