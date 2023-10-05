package Abstract_programs;
//Abstract Class Program
abstract class Abstract_Class
{
	abstract void add();
	void subtract()
	{
		int a=10, b=20,c=a-b;
		System.out.println("Subtract "+b+" from "+a+ " is "+c);
	}
}
class Mul extends Abstract_Class
{
	void Multiplication()
	{
		int a=10, b=20,c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+ " is "+c);
	}

	void add() 
	{
		int a=10, b=20,c=a*b;
		System.out.println("Addition of "+a+" and "+b+ " is "+c);
	}
}
public class Arithmatic_abstract extends Mul
{
	void division()
	{
		int a=10, b=20,c=a/b;
		System.out.println("Division of "+a+" by "+b+ " is "+c);
	}
	public static void main(String[] args) 
	{
		Arithmatic_abstract a=new Arithmatic_abstract();
		a.division();
		a.Multiplication();
		a.subtract();
		a.add();
	}

}
