package SuperCallingStatements;
//Non Parameterized super calling statement Program
class Parent_Class1
{
	Parent_Class1()
	{
		System.out.println("Parent class constructor get called");
	}
}
public class NonParameterized_scs extends Parent_Class1
{
	NonParameterized_scs()
	{
		/*here super(); is called implicitly[means by default parent class 
		constructor get called, no need to write super();]*/
		System.out.println("Child class constructor get called");
	}
	public static void main(String[] args) 
	{
		new NonParameterized_scs();
	}

}
