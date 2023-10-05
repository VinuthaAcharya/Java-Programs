package TestNG_Package;
/*Program for passing enabled parameter @Test*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledAnnotation 
{
	private static final boolean enabled = false;
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("@Test2");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
}
