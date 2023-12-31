package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Amazon_Assertion 
{
	@Test(dataProvider="Inputs")
	public void login(String username,String password)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bprime%2Blogin%2Bindia%26adgrpid%3D60002138638%26ext_vrnc%3Dhi%26hvadid%3D590512063151%26hvdev%3Dc%26hvlocphy%3D9062215%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D921064348552951419%26hvtargid%3Dkwd-435775516503%26hydadcr%3D15701_2267224%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.findElement(By.id("ap_email")).sendKeys(username);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("auth-signin-button")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	Assertion a=new Assertion();
	a.assertEquals("Amazon.in : amazon prime login india", title);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	driver.close();
	}
	
	@DataProvider(name="Inputs")
	public Object[][] applicationform()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="vinuthad70@gmail.com";
		data[0][1]="Tanu@123";
		
		data[1][0]="vinuthad70@gmail.com";
		data[1][1]="tanu123";
		return data;
	}
	
}
