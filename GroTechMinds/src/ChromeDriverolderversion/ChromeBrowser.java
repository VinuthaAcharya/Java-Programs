package ChromeDriverolderversion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser 
{
	@Test
	public void scenerio1()
	{
		System.setProperty("webdriver.chrome.driver","");
		ChromeDriver driver=new ChromeDriver();
	}
}
