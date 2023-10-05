package LaunchFacebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit extends TestData
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}
	
	@AfterMethod
	public void quit() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
