package TestNG_Package;
//Run a random method for 1000 times using for loop
import org.testng.annotations.Test;

public class Random1000 
{
	@Test
	public void senerio1()
	{
		for(int i=1;i<=1000;i++)
		{
		System.out.println(Math.random());
		}
	}
}
