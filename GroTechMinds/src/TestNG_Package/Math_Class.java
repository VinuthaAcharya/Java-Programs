package TestNG_Package;
//Math Class Program
import org.testng.annotations.Test;

public class Math_Class 
{
	@Test
	public void senerio1()
	{
		double q=Math.PI;
		System.out.println(q);
		System.out.println(Math.addExact(2, 34));
		System.out.println(Math.subtractExact(10, 100));
		System.out.println(Math.max(1, 2));
		System.out.println(Math.random());
	}
}
