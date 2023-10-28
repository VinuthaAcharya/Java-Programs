package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement canada=driver.findElement(By.linkText("Canada"));
		Point p=canada.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor js=(driver);
		js.executeScript("window.scrollBy(0,"+y+")");//scrolling down
		js.executeScript("window.scrollBy(0,-500)");//scrolling up
	}

}
