package ITstListener_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Reporting implements ITestListener
{
	TestCase1 t1=new TestCase1();
	
	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		Reporter.log("My Test has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("My Test has Passed");
		
		t1.senerio1();
		TakesScreenshot ts=t1.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\"+Math.random()+".png");
		try 
		{
			FileUtils.copyFile(source,destination);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("My Test has Failed");
		t1.senerio2();
		TakesScreenshot ts=t1.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\Screenshot\\FailScreenshoot"+Math.random()+".png");
		try 
		{
			FileUtils.copyFile(source,destination);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		Reporter.log("My Test has skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}
	
}
