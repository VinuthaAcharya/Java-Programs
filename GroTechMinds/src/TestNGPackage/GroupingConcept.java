package TestNGPackage;

import org.testng.annotations.Test;

public class GroupingConcept 
{
	@Test(groups= {"Smoke"})
	public void testcase1()
	{
	System.out.println("Smoke");	
	}
	@Test(groups= {"Smoke"})
	public void testcase2()
	{
		System.out.println("Smoke");	
	}
	@Test(groups= {"Smoke","System"})
	public void testcase3()
	{
		System.out.println("Smoke and System");
	}
	@Test(groups= {"Smoke","System","Regression"})
	public void testcase4()
	{
		System.out.println("Smoke,System and Regression");
	}
	@Test(groups= {"System","Regression"})
	public void testcase5()
	{
		System.out.println("System and Regression");
	}
	@Test(groups= {"System","Regression"})
	public void testcase6()
	{
		System.out.println("System and Regression");
	}
	@Test(groups= {"Regression"})
	public void testcase7()
	{
		System.out.println("Regression");
	}
	@Test(groups= {"Regression","System"})
	public void testcase8()
	{
		System.out.println("Regression and System");
	}
	@Test(groups= {"Smoke","Regression"})
	public void testcase9()
	{
		System.out.println("Smoke and Regression");
	}
}
