package TestNGPackage;
/*Program for passing invocationCount parameter @Test*/
import org.testng.annotations.Test;

public class InvocationCountTopic {
	@Test(invocationCount=10)
	public void testcase1()
	{
		System.out.println("1");
	}
}
