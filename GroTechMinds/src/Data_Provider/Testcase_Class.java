package Data_Provider;

import org.testng.annotations.Test;

public class Testcase_Class extends DataProvider_class
{
	@Test(dataProvider="data")
	public void test1(String a)
	{
		System.out.println(a);
	}
}
