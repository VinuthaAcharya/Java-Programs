package TestNG_Package;
/*There is a class which have all 9 annotations and
you have extra @Test, What will be the order of an execution?
 */
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NineAnnotation_2test 
{
	private static final int priority = 0;
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void at()
	{
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("@AfterTest");
	}

}
