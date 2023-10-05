package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteLink {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++)
		{
			WebElement a=links.get(i);
			String linkname=a.getAttribute("href");
			System.out.println(linkname);
		}
	}
}
