package SeleniumAutomation;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_ShoeR {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input)[4]")).sendKeys("Shoe");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'")).sendKeys("Shoe");
	}

}
