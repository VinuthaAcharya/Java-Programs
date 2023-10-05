package TestNG_Package;
/*There is a class which will have Aftermethod,BeforeMethod,
Test and AfterSuite and what is the order of execution.*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_2 
{
	@AfterSuite
	public void bs()
	{
		System.out.println("@AfterSuite");
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
