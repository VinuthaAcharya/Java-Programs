package TestNG_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_1 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	@Test
	public void tst()
	{
		System.out.println("@Test");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
}
