package TestNG_Package;
/*There is a class in which we have 3 @Test and only 1AM, 
 * what will be the order of execution?*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment86 
{
	@Test
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
}
