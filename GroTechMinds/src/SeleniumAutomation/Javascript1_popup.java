package SeleniumAutomation;
//UnhandledAlertException
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1_popup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/user/Downloads/JSAM.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("Vinutha");
		
	}

}
