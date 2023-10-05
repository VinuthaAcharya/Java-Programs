package Assignments;

public class Arithmatic {

	public static void add()
	{
		int a=150;
		int b=250;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is " +c);
	}
	public static void subtraction()
	{
		int a=150;
		int b=250;
		int c=a-b;
		System.out.println("Subtraction of "+b+" from "+a+" is " +c);
	}
	public static void multiplication()
	{
		int a=150;
		int b=250;
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is " +c);
	}
	public static void division()
	{
		int a=150;
		int b=250;
		int c=a/b;
		System.out.println("Division of "+a+" by "+b+" is " +c);
	}
	public static void main(String[] args) 
	{
		add();
		subtraction();
		multiplication();
		division();
	}

}
