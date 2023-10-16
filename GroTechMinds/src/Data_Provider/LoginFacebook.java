package Data_Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFacebook 
{
	
	@Test(dataProvider="logindetails")
	public void test1(String username,String password)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com");
		d1.findElement(By.id("email")).sendKeys(username);
		d1.findElement(By.id("pass")).sendKeys(password);
		d1.findElement(By.name("login")).click();
	}
	@DataProvider(name="logindetails")
	public Object[][] facebooklogin()
	{
		Object data[][]=new Object[3][2];
		//1st row
		data[0][0]="ram@gmail.com";
		data[0][1]="ram123";
		//2nd row
		data[1][0]="sita@gmail.com";
		data[1][1]="sita123";
		//3rd row
		data[2][0]="laxman@gmail.com";
		data[2][1]="laxman123";
		return data;
	}
}
