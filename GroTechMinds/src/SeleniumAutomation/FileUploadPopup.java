package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.xpath("//input[@name='file-935']"));
		upload.sendKeys("C:\\Users\\user\\Downloads\\GroTechMinds File Upload pdf.pdf");
	}

}
