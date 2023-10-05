package Upcasting;
//Create 4 classes as one,two,three,four and  create upcasing and downcasting
class One
{
void method1()
{
	System.out.println("First method");
}
}
class Two extends One
{
void method2()
{
	System.out.println("Second method");
}
}
class Three extends Two
{
void method3()
{
	System.out.println("Third method");
}
}
public class Casting_Program extends Three
{
	void method4()
	{
		System.out.println("Fourth method");
	}
	public static void main(String[] args) 
	{
		Two t=new Three();//Upcasting
		t.method1();
		t.method2();
		Three th=new Casting_Program();//Upcasting just for downcasting below one
		Casting_Program cp=(Casting_Program)th;//Downcasting
		cp.method1();
		cp.method2();
		cp.method3();
		cp.method4();		
	}
}
