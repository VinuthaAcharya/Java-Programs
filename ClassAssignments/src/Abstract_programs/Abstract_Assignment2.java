package Abstract_programs;
/*Class 20: Program for the below:
Abstract Class - CM-2 & AM-2, Abstract Class - CM-2 & AM-2, Class CM-2
[CM- Concrete method, AM- Abstract method]*/
abstract class a_class2
{
	abstract void am3();
	abstract void am4();
	void method5()
	{
		System.out.println("Non static concrete method of abstract class a_class2");
	}
	static void method6()
	{
		System.out.println("Static concrete method of abstract class a_class2");
	}
}
abstract class a_class1 extends a_class2
{
	abstract void am1();
	abstract void am2();
	void method3()
	{
		System.out.println("Non static concrete method of abstract class a_class1");
	}
	static void method4()
	{
		System.out.println("Static concrete method of abstract class a_class1");
	}
}
public class Abstract_Assignment2 extends a_class1
{
	void method1()
	{
		System.out.println("Non static concrete method of abstract class Abstract_Assignment2");
	}
	static void method2()
	{
		System.out.println("Static concrete method of abstract class Abstract_Assignment2");
	}
	
	public static void main(String[] args) 
	{
		Abstract_Assignment2 a=new Abstract_Assignment2();
		System.out.println("Child concrete class methods" );
		System.out.println("-----------------------------");
		a.method1();
		method2();
		System.out.println("\nParent abstract class methods" );
		System.out.println("-------------------------------");
		a.am1();
		a.am2();
		a.method3();
		method4();
		System.out.println("\nGrand Parent abstract class methods" );
		System.out.println("--------------------------------------");
		a.am3();
		a.am4();
		a.method5();
		method6();
	}
	void am1() 
	{
		System.out.println("Abstract method of class a_class1");
	}
	void am2() 
	{
		System.out.println("Abstract method of class a_class1");
	}
	void am3() 
	{
		System.out.println("Abstract method of class a_class2");
	}
	void am4() 
	{
		System.out.println("Abstract method of class a_class2");
	}
}
