package SeleniumAutomation;
//Scroll down
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown_YouTube {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.in/");
		driver.manage().window().maximize();
		for(int i=1;i<=2;)
		{
			JavascriptExecutor js=driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
	}

}
