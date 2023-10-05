package Abstract_programs;
/*Class 20: Program for the below
Class - CM-1(1 non static),Abstract Class - CM-1(Static) & AM -2,Abstract Class - CM-2(1Static;1-non 
static) & AM -2,Class - CM-2(1Static;1-non static)[CM- Concrete method,AM- Abstract method]*/
class Concrete_Class2
{
	void or_operator()
	{
		System.out.println("OR Operator");
	}
}
abstract class abstract_class2 extends Concrete_Class2
{
	abstract void am3();
	abstract void am4();
	static void and_operator()
	{
		System.out.println("AND Operator");
	}
}
abstract class abstract_class1 extends abstract_class2
{
	abstract void am1();
	abstract void am2();
	static void divide()
	{
		System.out.println("Divide");
	}
	void multiply()
	{
		System.out.println("Multiply");
	}
}
public class Concrete_class1 extends abstract_class1
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		Concrete_class1 c=new Concrete_class1();
		c.sub();
		add();
		c.multiply();
		divide();
		c.am1();
		c.am2();
		and_operator();
		c.or_operator();
		c.am3();
		c.am4();
	}
	void am1() 
	{
		System.out.println("Abstract method 1");
	}
	void am2()
	{
		System.out.println("Abstract method 2");
	}
	void am3() 
	{
		System.out.println("Abstract method 1");
	}
	void am4() 
	{
		System.out.println("Abstract method 1");
	}

}
