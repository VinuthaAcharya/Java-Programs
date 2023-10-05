package SuperCallingStatements;
//Parameterized super calling statement Program 
class Parent_class
{
	public Parent_class(String name) 
	{
		System.out.println("My name is "+name);
	}
}
public class Parameterised_scs extends Parent_class
{
	public Parameterised_scs() 
	{
		super("Vinutha");/*Parent class constructor get called here
		by passing parameters-it called explicitly*/
		System.out.println("I am Indian");
	}
	public static void main(String[] args) 
	{
		new Parameterised_scs();
	}

}
