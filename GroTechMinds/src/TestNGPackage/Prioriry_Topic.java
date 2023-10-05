package TestNGPackage;
/*How to set priority to @Test annotation?*/
import org.testng.annotations.Test;
public class Prioriry_Topic 
{
	@Test(priority=1)
	public void testcase1()
	{
		System.out.println("1");
	}
	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("2");
	}
	@Test(priority=3)
	public void testcase3()
	{
		System.out.println("3");
	}
	@Test(priority=4)
	public void testcase4()
	{
		System.out.println("4");
	}
	@Test(priority=5)
	public void testcase5()
	{
		System.out.println("5");
	}
	
	
}
