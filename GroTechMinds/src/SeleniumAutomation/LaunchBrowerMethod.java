package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowerMethod {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();//empty browser
		d1.get("https://www.google.co.in/");
		System.out.println(d1.getWindowHandle());
		System.out.println(d1.getWindowHandles());
	}

}
