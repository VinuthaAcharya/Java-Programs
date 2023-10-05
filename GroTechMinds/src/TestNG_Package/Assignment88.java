package TestNG_Package;
/*There is a class in which 1BS, 1AS and 3 @Test, 1AM, 1BM, 
 * What will be the order of execution?*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment88 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("@AfterTest");
	}@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("@Test2");
	}
	@Test
	public void test3()
	{
		System.out.println("@Test3");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
}
