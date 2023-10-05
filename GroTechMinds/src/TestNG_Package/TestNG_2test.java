package TestNG_Package;
/*"If there are 2 @test then what will be the order of execution?
as per alphabetical order."*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_2test 
{
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
	@Test
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
