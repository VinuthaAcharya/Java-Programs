package Assignments;

public class Constructor_Overloading1 
{
	Constructor_Overloading1(int a, int b) 
	{
		System.out.println("Addition of "+a+ " and "+b+ " is "+(a+b));
	}
	Constructor_Overloading1(String name)
	{
		System.out.println("My name is "+name);
	}
	Constructor_Overloading1(double height,float weight)
	{
		System.out.println("Height of an Elephant is " +height+"feet and Weight of an Elephant is "+weight+"kg" );
	}
	Constructor_Overloading1(char a)
	{
		System.out.println("First letter of English alphabets is "+a);
	}
	Constructor_Overloading1(boolean t) 
	{
		System.out.println("It is not possible to develop constructor overloading without parameter : "+t);
	}
	public static void main(String[] args) 
	{
		new Constructor_Overloading1(15,35);
		new Constructor_Overloading1("VInutha");
		new Constructor_Overloading1(10.4,300.6f);
		new Constructor_Overloading1('A');
		new Constructor_Overloading1(true);

	}

}
