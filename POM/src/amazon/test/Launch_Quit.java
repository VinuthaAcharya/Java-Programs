package amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Launch_Quit implements ITestListener
{
	WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		ITestListener.super.onTestStart(result);
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
//		WebElement link=driver.findElement(By.linkText("Try different image"));
//		if(link.isDisplayed())
//		{
//		link.click();
//		}
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		
		Testcase1 ts1=new Testcase1();		
		ts1.login_in_amazon_application();
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		ITestListener.super.onFinish(context);
		//driver.close();
	}
	

}
