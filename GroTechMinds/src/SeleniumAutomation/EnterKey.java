package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterKey {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();//empty browser
		d1.get("https://www.google.co.in/");
		d1.manage().window().maximize();
		WebElement search=d1.findElement(By.name("q"));
		search.sendKeys("Sachin Tendulkar");
		search.sendKeys(Keys.ENTER);
	}

}
