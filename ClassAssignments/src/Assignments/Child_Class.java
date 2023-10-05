package Assignments;
//Below program is an example for method overriding
class Parent
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
}

public class Child_Class extends Parent
{
	void add()
	{
		super.add();//super keyword used to call parent class method
		int a=10;
		int b=20;
		int c=30;
		int d=a+b+c;
		System.out.println("Sum of "+a+","+b+" and "+c+" is "+d);
	}

	public static void main(String[] args) 
	{
		Child_Class c=new Child_Class();
		c.add();
	}

}
