package LaunchFacebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase extends LaunchandQuit
{
	@Test
	public void scenerio1() throws EncryptedDocumentException, IOException
	{
		exceldata();
		WebElement Uname=driver.findElement(By.xpath("(//input)[3]"));
		Uname.sendKeys(username);
		WebElement Pw=driver.findElement(By.xpath("(//input)[4]"));
		Pw.sendKeys(password);
		WebElement Login=driver.findElement(By.xpath("//button"));
		Login.click();
	}
}
