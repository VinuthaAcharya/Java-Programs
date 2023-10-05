package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}

}
